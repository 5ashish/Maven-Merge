package pom;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class LoginPageExcel extends BasePage implements AutoConstant {
	
	WebDriver driver;
	@FindBy(name="uid")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	@FindBy(name="btnLogin")
	private WebElement loginButton;
	
	public LoginPageExcel(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(int i) throws IOException
	{
		sendKeys(username,ExcelLibrary.value(loginsheet, i, 0));
		attributevalue(username);
		sendKeys(password, ExcelLibrary.value(loginsheet, i, 1));
		attributevalue(password);
		
		click(loginButton);
		
	}

}
