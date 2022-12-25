package testBackend;


import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import generics.AutoConstant;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Homepage;
import pom.Mobile;
import pom.Xperia;
import pomBackend.Edit;
import pomBackend.HomepageBackend;
import pomBackend.LoginBackend;
import pomBackend.Preview;

public class TechPandaTest_Day12 implements AutoConstant {
	@Test(priority = 1)
	public void placeOrder() throws AWTException, InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get(url+"review/product/list/id/1/");

		Xperia xp= new Xperia(driver);
		xp.reviewMethod();
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(urlBackend);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		LoginBackend loginBack= new LoginBackend(driver);
		loginBack.loginMethod();
		HomepageBackend homeB=new HomepageBackend(driver);
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		homeB.PReviewMethod();
		Preview pre=new Preview(driver);
		pre.editMethod();
		Edit edit= new Edit(driver);
		edit.statusApprovedMethod();
		driver.get(url);
		Homepage home= new Homepage(driver);
		
		home.mobileMethod();
		
		Mobile mob= new Mobile(driver);
		mob.xperiaMethod();
		xp.VerifyReviewsMethod();
	}
}
	
	
