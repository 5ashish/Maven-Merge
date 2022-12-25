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
public class Login extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(xpath="//span/span[.='Create an Account']")
	private WebElement createAccount;
	
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="send2")
	private WebElement login;
	@FindBy (xpath = "//a[.='Logout']")
	private WebElement logout;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createAccountMethod()
	{
click(createAccount);
	}
	public void login()
	{
		sendKeys(email, mailIDTechPanda);
		sendKeys(password, passwordTechpanda);
		click(login);
	}
	
	
}
