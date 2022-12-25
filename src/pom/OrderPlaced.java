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
public class OrderPlaced extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(xpath = "//h1[.='Your order has been received.']")
	private WebElement orderConfirmation;
	
	@FindBy(xpath = "(//h2[.='Thank you for your purchase!']/..//a)[1]")
	private WebElement orderID;
	
	public OrderPlaced(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void orderPlacedMethod()
	{
		System.out.println(orderConfirmation.getText());
		if (orderConfirmation.getText().equals("YOUR ORDER HAS BEEN RECEIVED.")) {
			
		} else {
				System.out.println("not placed");
		}
		
	}
	public String orderIDMEthod() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("order number with orderID  "+orderID.getText());
		return orderID.getText();
	}

	
	}
