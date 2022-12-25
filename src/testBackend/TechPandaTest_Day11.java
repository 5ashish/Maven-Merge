package testBackend;


import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import generics.AutoConstant;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomBackend.HomepageBackend;
import pomBackend.LoginBackend;

public class TechPandaTest_Day11 implements AutoConstant {
	@Test(priority = 1)
	public void placeOrder() throws AWTException, InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get(urlBackend);
		driver.navigate().refresh();
		LoginBackend log= new LoginBackend(driver);
		log.loginMethod();
		HomepageBackend home= new HomepageBackend(driver);
		home.ordersMethod();
		home.invoiceMethod();
		home.verifyErrorMessageMethod();
//		home.completeInvoiceMethod();
		home.veryDownloadMethod();
		
			
	}
}
	
	
