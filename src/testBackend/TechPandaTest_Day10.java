package testBackend;


import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generics.AutoConstant;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomBackend.HomepageBackend;
import pomBackend.LoginBackend;

public class TechPandaTest_Day10 implements AutoConstant {
	@Test(priority = 1)
	public void placeOrder() throws AWTException, InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get(urlBackend);
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMinutes(1));
		

		HomepageBackend home= new HomepageBackend(driver);
		
		driver.navigate().refresh();
		LoginBackend log= new LoginBackend(driver);
		log.loginMethod();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='close']")));
		home.closeNPMethod();
		System.out.println("hidden division popup closed");
		
		home.ordersMethod();
		
			
	}
}
	
	
