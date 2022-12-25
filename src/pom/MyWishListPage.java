package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import generics.AutoConstant;
import generics.BasePage;
@Listeners(generics.Screenshot.class)
public class MyWishListPage extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[.='Add to Cart'])[2]")
	private WebElement add2Cart;
	
	
	public MyWishListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void add2CartMethod()
	{
click(add2Cart);
	}
	

	
	}
