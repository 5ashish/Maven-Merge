package generics;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant {
	public static WebDriver driver;
	@BeforeMethod
	public void Url() throws InterruptedException
	{		
	
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get(url);
	 driver.navigate().refresh();
	 driver.get(url);
	driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void logout() throws AWTException
	{
		
//	driver.quit();
	}
}
