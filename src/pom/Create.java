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
public class Create extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(id="firstname")
	private WebElement firstname;
	
	@FindBy(id="lastname")
	private WebElement lastname;
	@FindBy(id="email_address")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="confirmation")
	private WebElement passwordConfirmation;
	
	@FindBy(xpath="//span/span[.='Register']")
	private WebElement register;
	
	public Create(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createMethod()
	{
sendKeys(firstname, "Ashish");
sendKeys(lastname, "Das");
sendKeys(password, passwordTechpanda);
sendKeys(passwordConfirmation, passwordTechpanda);
sendKeys(email,mailIDTechPanda);
click(register);
	}
	
	
}
