package pom;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;

import generics.AutoConstant;
import generics.BasePage;
@Listeners(generics.Screenshot.class)
public class CheckOutPage extends BasePage implements AutoConstant {
	
	WebDriver driver;
	@FindBy(id="billing-address-select")
	private WebElement billingAddress;
	
	
	
	@FindBy(name="billing[firstname]")
	private WebElement firstname;
	@FindBy(id="billing:lastname")
	private WebElement lastname;		
	@FindBy(id="billing:street1")
	private WebElement address;
	@FindBy(name="billing[city]")
	private WebElement city;
	@FindBy(id="billing:region_id")
	private WebElement state;
	@FindBy(id="billing:postcode")
	private WebElement zip;
	@FindBy(id="billing:telephone")
	private WebElement telephone;
	@FindBy(id="billing:use_for_shipping_yes")
	private WebElement shipToThisAddress;
	@FindBy(xpath="(//span[.='Continue'])[2]")
	private WebElement continueButton1;
	@FindBy(xpath="(//span[.='Continue'])[4]")
	private WebElement continueButton2;	
	@FindBy(xpath="(//span[@class='price'])[3]")
	private WebElement flatRate;
	@FindBy(xpath="//h2[.='Shipping Method']/../..//button[@type='button']")
	private WebElement continue3;
	
	@FindBy(xpath="(//span[.='Continue'])[7]")
	private WebElement continue4;
			@FindBy(id="p_method_checkmo")
	private WebElement check;
			
					@FindBy(xpath="(//span[.='Place Order'])[2]")
					private WebElement place;
					
							@FindBy(xpath="(//span[@class='price'])[5]")
							private WebElement addedShipPrice;
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void shippingMethod() throws InterruptedException
	{
sendKeys(firstname, "Ashish");
sendKeys(lastname, "Das");
sendKeys(address, "ABC");
sendKeys(city, "janini bhai");
selectbyvisibletext(state, "New York");
sendKeys(zip, "542896");
click(shipToThisAddress);
click(continueButton1);
Thread.sleep(3000);
String shippingRate=flatRate.getText();
System.out.println(shippingRate);

if (flatRate.getText().equals("$5.00")) {
	System.out.println("Flat rate 5$ generated");
	
}
javascriptclick(driver, continue3);
Thread.sleep(3000);
click(check);
click(continue4);
Thread.sleep(3000);
String addedPrice=addedShipPrice.getText();
System.out.println(addedPrice);
if (shippingRate.equals(addedPrice)) {
	System.out.println("Shipping cost is added to total product cost");
} 
else System.out.println("not equal");
click(place);
}
	
	
	public void billingAddressMethod()
	{
		selectbyvisibletext(billingAddress, "New Address");
	}
	
}