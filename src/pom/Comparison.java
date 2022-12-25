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
public class Comparison extends BasePage implements AutoConstant {
	
	WebDriver driver;
	
	@FindBy(xpath="//h1['Compare Products']")
	private WebElement heading;
	
	@FindBy(className = "product-name")
	private List<WebElement> addedProducts;
	
	
	public Comparison(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList addedProductsCompareMethod()
	{
		ArrayList comparePageProducts=new ArrayList<>();
for (int i = 0; i < addedProducts.size(); i++) {
	comparePageProducts.add(addedProducts.get(i).getText());
	
}
		return comparePageProducts;
		
	}
	
	
	
}
