package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import generics.AutoConstant;
import generics.BasePage;
@Listeners(generics.Screenshot.class)
public class ShoppingCart extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[.='Proceed to Checkout'])[2]")
	private WebElement checkOut;
	
	@FindBy(xpath  = "//h2[@class='product-name']/../..//input[@class='input-text qty']")
	private WebElement quantity;
	@FindBy(xpath = "(//span[.='Update'])[2]")
	private WebElement update;
	
	@FindBy(xpath = "//strong[.='Grand Total']/../..//span[@class='price']")
	private WebElement grandTotal;
	
	@FindBy(id="coupon_code")
	private WebElement couponText;
	
	@FindBy(xpath ="(//span[.='Apply'])[2]")
	private WebElement apply;
	
	@FindBy(xpath ="//td[contains(.,'Subtotal')]/..//span[@class='price']")
	private WebElement subTotal;
	
	@FindBy(xpath ="(//td[contains(.,'Subtotal')]/../..//span[@class='price'])[2]")
	private WebElement discount;
	
	
	public ShoppingCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkOutMethod()
	{
click(checkOut);
	}
	public void quantityMethod()
	{
		clear(quantity);
clear(quantity);
sendKeys(quantity, "1");
click(update);
}
	public void quantityAnyMethod(String s)
	{
		
		clear(quantity);
clear(quantity);
sendKeys(quantity, s);
click(update);
}
	public String grandTotalMehtod()
	{
		System.out.println(grandTotal.getText());
		return grandTotal.getText();
		
	}
	
	public void checkOut()
	{
		click(checkOut);
	}
	
public void applyCouponCodeMethod()
{
	clear(couponText);
	sendKeys(couponText, "GURU50");
	click(apply);
}

public void verifyDiscountMethod()
{
	String sub= subTotal.getText();
	System.out.println("sub Total price  "+sub);
	double subDouble=Double.parseDouble(sub.replace("$", ""));
	System.out.println(subDouble);
	String disc=discount.getText().replace("-", "");
	System.out.println("discount  "+disc);
	double discDouble=Double.parseDouble(disc.replace("$", ""));
	System.out.println(discDouble);
	String grand=grandTotal.getText();
	System.out.println("Grand Total "+grand);
	double grandDouble=Double.parseDouble(grand.replace("$", ""));
	System.out.println(grandDouble);
	
	if (subDouble/20==discDouble) {
		System.out.println("discount generated is 5%, Verified");
		} 
	else		System.out.println("different discount");
	
	if (subDouble-(subDouble/20)==grandDouble) 		
		System.out.println("discount applied to Grand Total");
	else System.out.println("discount not applied to Grand Total & defect found");
}

	
	}
