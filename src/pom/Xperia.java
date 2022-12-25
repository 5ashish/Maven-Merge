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
public class Xperia extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[.='Sony Xperia']/../..//span[@class='price'])")
	private WebElement xperiaProductPrice;
	
	@FindBy(className = "product-name")
	private List<WebElement> productName;
	
	@FindBy(id="Quality 1_1")
	private WebElement q;
	@FindBy(id="review_field")
	private WebElement thoughts;
	
	@FindBy(xpath="//li/span[.='Reviews']")
	private WebElement reviewsTab;
	
	@FindBy(id="summary_field")
	private WebElement summary;
	
	@FindBy(id="nickname_field")
	private WebElement nickName;
	
	@FindBy(xpath = "//button[starts-with(@title,'Submit')]")
	private WebElement submit;
	
			@FindBy(xpath = "(//div[@class='review-heading']/..//a)[1]")
			private WebElement verify3;
	public Xperia(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String xperiaDetailsPriceMethod()
	{
		return driver.getTitle();
	}
	
	public void reviewMethod()
	{
		click(q);
			sendKeys(thoughts, "1");
			sendKeys(summary, "3");
			sendKeys(nickName, "2");
			click(submit);
	}
	public void VerifyReviewsMethod()
	{
			reviewsTab.click();
			String verifyReviewApproved=verify3.getText();
			if (verifyReviewApproved.equals("3")) {
				System.out.println("approved verified & comment Shown");
				
			} else {
				System.out.println("approved not verified & comment not Shown");
			}
	}
	
	
	
	
}
