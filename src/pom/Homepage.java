package pom;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import generics.AutoConstant;
import generics.BasePage;
@Listeners(generics.Screenshot.class)
public class Homepage extends BasePage implements AutoConstant {
	
	WebDriver driver;
	@FindBy(xpath="//a[.='Mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//a[.='TV']")
	private WebElement tv;
	
	@FindBy(xpath="//h2[contains(.,'This is demo site')]")
	private WebElement actualHomepageText;
	
	@FindBy(xpath="(//select[@title='Sort By'])[1]")
	private WebElement sortBy;
	
	@FindBy(xpath="(//a[.='My Account'])[2]")
	private WebElement myAccount;
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void mobileMethod() throws AWTException
	{
		click(mobile);
	}
	public void tvMethod() throws AWTException
	{
		click(tv);
	}
	public String actualHomepageTextMethod()
	{
		return actualHomepageText.getText();
	}
	
	public void myAccountMethod()
	{
click(myAccount);
	}
	
	

}
