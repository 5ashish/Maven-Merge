package generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class BasePage {
	
	public void getUrlMethod(WebDriver driver, String url)
	{
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains(url))
			System.out.println("contains"+ url);
		else
			System.out.println("doesn't contains"+ url);
	}
	public void getTitle(WebDriver driver, String title)
	{
		String actualtitle=driver.getTitle();
		if(actualtitle.contains(title))
			System.out.println("contains"+ title);
		else
			System.out.println("doesn't contains"+title);
	}
	public void getText(WebElement ele, String text)
	{
		String actualTagName=ele.getText();
		if(actualTagName.contains(text))
			System.out.println("contains"+ text);
		else
			System.out.println("doesn't contains"+text);
	}
	public void tagName(WebElement ele, String tagName)
	{
		String actualTagName=ele.getTagName();
		if(actualTagName.contains(tagName))
			System.out.println("contains"+ tagName);
		else
			System.out.println("doesn't contains"+tagName);
	}
	
	public void setSize(WebDriver driver,int width, int height )
	{
		Dimension d= new Dimension(width, height);
		driver.manage().window().setSize(d);
	}
	
	public void getSize(WebDriver driver,WebElement ele )
	{
		System.out.println(ele.getSize());;
	}
	
	public void position(WebDriver driver )
	{
		System.out.println(driver.manage().window().getPosition());
	}
	
	public void close(WebDriver driver)
	{
		driver.close();
	}
	public void quit(WebDriver driver)
	{
		driver.quit();
	}
	public void click(WebElement ele)
	{
		ele.click();
	}
	public void clear(WebElement ele)
	{
		ele.clear();
	}
	public void attributevalue(WebElement ele)
	{
		ele.getAttribute("value");
	}
	public void cssValue(WebElement ele)
	{
		ele.getCssValue("color");
	}
	public void location(WebElement ele, int x, int y)
	{
		x=ele.getLocation().getX();
		y=ele.getLocation().getY();
		System.out.println(x+"  "+y);
	}
	public void rect(WebElement ele, int width, int height)
	{
		width=ele.getRect().getWidth();
		height=ele.getRect().getHeight();
		System.out.println(width+"  "+height);
	}
	public void rectxy(WebElement ele, int x, int y)
	{
		x=ele.getRect().x;
		y=ele.getRect().y;
		System.out.println(x+"  "+y);
	}
	public void autosuggenstions(List<WebElement> suggestions, String text)
	{
		for (int i = 0; i < suggestions.size(); i++) {
			if (suggestions.get(i).getText().contains(text)) {
				suggestions.get(i).click();
			}
			
		}
	}
	public static  void selectbyvisibletext(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	public void selectBValue(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.selectByValue(text);
	}
	public void selectbyIndex(WebElement ele , int i)
	{
		Select sel=new Select(ele);
		sel.selectByIndex(i);
	}
	
	public void deSelectvisibletext(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.deselectByVisibleText(text);
	}
	public void deSelectbyIndex(WebElement ele , int i)
	{
		Select sel=new Select(ele);
		sel.deselectByIndex(i);
	}
	public void deSelectbyValue(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.deselectByValue(text);
	}
	public void isMultiple(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		System.out.println(sel.isMultiple());
	}
	public void firstSelectedOption(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		System.out.println(sel.getFirstSelectedOption().getText());
	}
		
	public void isDisplayed(WebElement ele )
	{
		if(ele.isDisplayed())
		{
			System.out.println("element is displayed");
		}
		else
		{
			System.out.println("element is not displayed");
		}
	}
	public void isEnabled(WebElement ele )
	{
	System.out.println(ele.isEnabled());
	}
	public void isSelected(WebElement ele )
	{
	System.out.println(ele.isSelected());
	}
	
	public void movetoelement(WebDriver driver , WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void clickActions(WebDriver driver , WebElement ele)
	{
		Actions act=new Actions(driver);
		act.click(ele).perform();
	}
	public void clickAndHold(WebDriver driver , WebElement ele)
	{
		Actions act=new Actions(driver);
		act.clickAndHold(ele).perform();
	}
	public void contextClick(WebDriver driver , WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	public void doubleClick(WebDriver driver , WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	public void sendKeys(WebElement ele,String text)
	{

		ele.sendKeys(text);//
	}
	
	public void getoptions(WebElement ele)
	{
		Select sel=new Select(ele);
		List<WebElement> options=sel.getOptions();
		System.out.println("size of listbox is" +options.size());
	}
	public void getAllSelected(WebDriver driver, WebElement ele)
	{
		Select sel=new Select(ele);
		List<WebElement> options=sel.getAllSelectedOptions();
		System.out.println(options);
	}
	public void getFirstSelected(WebDriver driver, WebElement ele)
	{
		Select sel=new Select(ele);
		WebElement fs=sel.getFirstSelectedOption();
		System.out.println(fs.getText());
	}
	
	public void getIndex(WebElement ele)
	{
		Select sel=new Select(ele);
		List<WebElement> options=sel.getOptions();
		WebElement a=options.get(0);
		String s=a.getText();
		
	}
	public void select(List<WebElement> bullets, String text) {
	for (int i = 0; i < bullets.size(); i++) {
		
		if (bullets.get(i).getText().equals(text)) {
			bullets.get(i).click();
		}			
	}
	}
	
	public void isEmpty(WebElement ele)
	{
		Select sel=new Select(ele);
		List<WebElement> options=sel.getOptions();
		boolean x=options.isEmpty();
		if (x) {
			System.out.println("no options");
		} else {
			System.out.println("options are there"); 
		}
	
	}
	public void explicitwaittitleis(WebDriver driver , String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	public void robotEscape() throws AWTException, InterruptedException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	public void robotEnter() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void robotEnterB() throws AWTException, InterruptedException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_B);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_B);
	}
	public void robotS() throws AWTException, InterruptedException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_S);
	}
	public void robotTab() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public void javascriptclick(WebDriver driver , WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	public void javascriptEnterusername(WebDriver driver , WebElement ele )
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='mngr451536'", ele);
	}
	

	public void javascriptEnterData(WebDriver driver , WebElement ele , String text)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+text+"'", ele);
	}

	public void javascriptEnterpassword(WebDriver driver , WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='utajAvu'", ele);
	}
	public void javascriptEnterData(WebDriver driver , WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='kuch v'", ele);
	}
	public void javascriptPageScroll(WebDriver driver , WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	public void javascriptPageScrollToElement(WebDriver driver , WebElement ele, int x, int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		x=ele.getLocation().getX();
		y=ele.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void javascriptPageScrollToElementView(WebDriver driver , WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}
	public void switchToiframeIndex(WebDriver driver, int i)
	{
		driver.switchTo().frame(i);
	}
	public void switchToParentframeIndex(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	public void switchToiframeIDorName(WebDriver driver,String s)
	{
		driver.switchTo().frame(s);
	}
	public void alertaccept(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void alertdismiss(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public void getWindowHandle(WebDriver driver)
	{
		System.out.println(driver.getWindowHandle());
		Set<String> windows=driver.getWindowHandles();
		System.out.println("number of windows are"+windows.size());
	}
	public void getWindowHandles(WebDriver driver)
	{
		Set<String> windows=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(windows);
		for (int i = 0; i < al.size(); i++) 
		{
		if (driver.getTitle().contains("Tracking")) 
		System.out.println("child browser opened");
		else
		System.out.println("same browser");
		}
	}
	public void Assert(WebDriver driver, String a, String b)
	{
		a=driver.getTitle();
		org.testng.Assert.assertEquals(a, b);// test class
	}
	public void softAssert(WebDriver driver, String a, String b)
	{
		SoftAssert s=new SoftAssert();
		a=driver.getTitle();
		s.assertEquals(a, b);
	}
	
}