package test;


import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.AutoConstant;
import generics.BasePage;
import generics.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Create;
import pom.Homepage;
import pom.Login;
import pom.ShareWishList;
import pom.TV;
import pom.WishList;

public class P extends BasePage {
	@Test(priority = 1)
	public void login() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		
		WebElement upload=driver.findElement(By.xpath("//button[.='Upload Resume']"));
		
		upload.click();
		
	}
	}