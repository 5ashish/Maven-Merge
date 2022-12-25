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
public class TV extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	
	
	@FindBy(xpath= "//a[.='LG LCD']")
	private WebElement lgLCD;
	
	@FindBy(xpath= "//a[.='LG LCD']/../../..//a[.='Add to Wishlist']")
	private WebElement lgLCDWishList;
	@FindBy(xpath= "//h1[.='Shopping Cart is Empty']")
	private WebElement emptymessage;
	
	public TV(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addLGToWishlist()
	{
		click(lgLCDWishList);
	}
	
	
	
	
	
	
}
