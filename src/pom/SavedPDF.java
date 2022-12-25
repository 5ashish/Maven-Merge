package pom;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import generics.AutoConstant;
import generics.BasePage;
@Listeners(generics.Screenshot.class)
public class SavedPDF extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	
	@FindBy(xpath="(//span[.='Close Window'])[2]")
	private WebElement close;
	
	@FindBy(xpath="//a[.='Print Order']")
	private WebElement print;
	public SavedPDF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifySavedMethod() throws AWTException
	{
		File fileLocation= new File("C:\\Users\\LENOVO\\Documents");
		File[] filesList=fileLocation.listFiles();
		for (File file : filesList) {
			if (file.getName().contains("Print Order"))	System.out.println("downloaded");
			
		}
	}
	

	
	}
