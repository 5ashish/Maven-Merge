package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import generics.AutoConstant;
import generics.BasePage;
@Listeners(generics.Screenshot.class)
public class MyOrders extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(xpath="//select[@title='Results per page']")
	private WebElement show;
	
	
	@FindBy(xpath="(//li[.='2'])[1]")
	private WebElement page2;
	@FindBy(xpath="//a[.='My Orders']")
	private WebElement myOrder;
	
	@FindBy(xpath="(//td[@class='number'])[1]/..//a[.='View Order']")
	private WebElement viewlastOrder;
	
	@FindBy(xpath="//a[.='Reorder']")
	private WebElement reOrderLast;
	
	
	@FindBy(xpath="(//td[@class='number'])[1]")
	private WebElement lastOrderID;
	public MyOrders(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void showMethod()
	{
selectbyvisibletext(show, "50");
	}
	public void page2()
	{

click(page2);
	}
	public void viewlastOrderMethod()
	{
		click(viewlastOrder);
	}
	public void reOrderLastMethod()
	{
		click(reOrderLast);
	}
	
	public String lastOrderIDMethod()
	{
		
		return lastOrderID.getText();
	}
	
	}
