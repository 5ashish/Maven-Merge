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
public class Cart extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@title='Qty']")
	private WebElement quantity;
	
	@FindBy(xpath= "(//span[.='Update'])[2]")
	private WebElement update;
	//p[@class='item-msg error']
	@FindBy(xpath= "//p[@class='item-msg error']")
	private WebElement error;
	
	@FindBy(xpath= "//span[.='Empty Cart']")
	private WebElement empty;
	
	@FindBy(xpath= "//h1[.='Shopping Cart is Empty']")
	private WebElement emptymessage;
	
	public Cart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void quantityMethod()
	{
sendKeys(quantity, "000");
	}
	public void updateMethod()
	{
click(update);
	}
	
	public void verifyerrorMethod()
	{
		
System.out.println(error.getText());
if (error.getText().equals(cartErrorMessage)) {
	System.out.println("verified");
	
}

	}
	
	
	public void emptyCartMethod()
	{
		click(empty);
	}
	
	public void emptyCartMessageMethod()
	{
		System.out.println(emptymessage.getText());
		if (emptymessage.getText().equals("SHOPPING CART IS EMPTY")) {
			System.out.println("cart empty verified");			
		}
	}
	
	
}
