package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import generics.AutoConstant;
import generics.BasePage;
@Listeners(generics.Screenshot.class)
public class MyAccount extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[.='My Wishlist']")
	private WebElement myWishlist;
	
	@FindBy(xpath="//a[.='My Orders']")
	private WebElement myOrder;
	
	public MyAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void myWishlistMethod()
	{
click(myWishlist);
	}
	public void orderMethod()
	{
		click(myOrder);
	}
	

	
	}
