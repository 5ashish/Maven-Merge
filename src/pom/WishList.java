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
public class WishList extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	
	@FindBy(name="save_and_share")
	private WebElement share;
	@FindBy(xpath = "//span[.='Your Wishlist has been shared.']")
	private WebElement added;
	
	public WishList(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void shareWishMethod()
	
	{
		click(share);
	}
	public String added()
	{
		System.out.println(added.getText());
		return added.getText();
	}
	
	
	
	
}
