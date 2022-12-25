package pom;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import generics.AutoConstant;
import generics.BasePage;
@Listeners(generics.Screenshot.class)
public class ViewOdrer extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//div[@class='page-title title-buttons']")
	private WebElement oorderIDView;
	
	@FindBy(xpath="//a[.='Print Order']")
	private WebElement print;
	public ViewOdrer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String orderIDViewMethod()
	{
		return oorderIDView.getText();
	}
	
	public void SaveAsPdfMethod() throws AWTException, InterruptedException
	{
		click(print);
		Set<String> win=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(win);
		driver.switchTo().window(al.get(1));
		Thread.sleep(2000);
		robotS();
		robotEnter();
		Thread.sleep(2000);
		robotEnter();
//		driver.close();
		System.out.println("saved as pdf");
		driver.switchTo().window(al.get(0));
		
	}
	

	
	}
