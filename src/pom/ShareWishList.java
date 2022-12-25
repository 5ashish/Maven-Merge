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
public class ShareWishList extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	
	@FindBy(id="email_address")
	private WebElement enterMailID;
	@FindBy(id="message")
	private WebElement enterMessage;
	@FindBy(xpath="//span/span[.='Share Wishlist']")
	private WebElement shareWishlist;
	
	
	public ShareWishList(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void shareMethod()
	
	{
		sendKeys(enterMailID, mailIDTechPanda);
		sendKeys(enterMessage, "message");
		click(shareWishlist);
		
	}
	
	
}
