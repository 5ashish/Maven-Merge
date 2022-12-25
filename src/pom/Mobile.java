package pom;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;

import com.fasterxml.jackson.databind.type.CollectionLikeType;

import generics.AutoConstant;
import generics.BasePage;
@Listeners(generics.Screenshot.class)
public class Mobile extends BasePage implements AutoConstant {
	
	WebDriver driver;
	@FindBy(xpath="//a[@title='Sony Xperia']/../..//span[.='Add to Cart']")
	private WebElement xperiaAdd;
	@FindBy(xpath="(//select[@title='Sort By'])[1]")
	private WebElement sortBy;
	
	@FindBy(className = "product-name")
	private List<WebElement> productName;
	@FindBy(xpath = "//a[text()='Sony Xperia']")
	private WebElement xperia;
	@FindBy(xpath = "//a[text()='Sony Xperia']/../..//span[@class='price']")
	private WebElement xperiaListPrice;
	@FindBy(xpath = "//a[text()='Sony Xperia']/../../..//a[.='Add to Compare']")
	private WebElement xperiacompare;
	
	@FindBy(xpath = "//a[text()='IPhone']/../..//a[.='Add to Compare']")
	private WebElement iPhonecompare;
	
	@FindBy(xpath = "//span[contains(.,'Compare Products')]/../../..//p[@class='product-name']")
	private WebElement addedToCompare;
	
	@FindBy(xpath= "//span[contains(.,'Compare Products')]/../../..//p[@class='product-name']")
	private List<WebElement> addedProducts;
	
	
	@FindBy(xpath = "(//span[.='Compare'])[2]")
	private WebElement compare;
	
	
	
	
	@FindBy(xpath="//a[text()='IPhone']/../../..//span[.='Add to Cart']")
	private WebElement iphoneToCart;

	public Mobile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void xperiaMethod()
	{
		click(xperia);
	}
	public String xperiaListPriceMethod()
	{
		return xperiaListPrice.getText();
	}
	
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void sortBy() throws AWTException, InterruptedException
	{

		Select sel=new Select(sortBy);
		sel.selectByVisibleText("Price");
		Thread.sleep(2000);
		selectbyvisibletext(sortBy, "Name");
	}
	public void sortVerifyMethod()
	{
		
ArrayList a=new ArrayList<>();
for (int i = 0; i < productName.size(); i++) 
{
	a.add(productName.get(i).getText());
}

ArrayList b=new ArrayList<>(a);

Collections.sort(b);

int x=0;
for (int i = 0; i < productName.size(); i++) {
	if (a.get(i).equals(b.get(i))) {
x++;		
	}
	else System.out.println("no");
}
if (x==productName.size()) {
	System.out.println("All "+x+" products shorted by name");
	
}
	}
	
	public void xperiaAddMethod() throws AWTException
	{
		click(xperiaAdd);
	}

	public void compareMobilesMethod() throws AWTException
	{
		click(xperiacompare);
		click(iPhonecompare);
		
	}
	
	public void compareMethod() throws AWTException
	{
		click(compare);
		Set<String> windows=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(windows);
		driver.switchTo().window(al.get(1));

	}
	
	public ArrayList addedProductsMobileMethod()
	{
		ArrayList mobilesPageProducts=new ArrayList<>();
for (int i = 0; i < addedProducts.size(); i++) {
	mobilesPageProducts.add(addedProducts.get(i).getText());
	
}
		return mobilesPageProducts;
		
	}
	
	public void iphoneToCartMethod() throws InterruptedException
	{
		click(iphoneToCart);
	}
	
	
}
