package generics;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class Screenshot implements ITestListener
{
	
	public void onFinish(ITestContext result) {
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String name=result.getName();
		Date today=Calendar.getInstance().getTime();
		String date=today.toString();
//		String time=Calendar.getInstance().getTime().toString();
		
		File dest= new File("./onFinish_ITestContext/"+name+date+".png");
//		File destfile=new File("./Failedscreenshot/ " +name +date+ ".mp4");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
		}		
	}
	
	
	
	public void onTestSkipped(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String name=result.getName();
		Date today=Calendar.getInstance().getTime();
		String time=today.toString();
//		String time=Calendar.getInstance().getTime().toString();
		
		File dest= new File("./onTestSkipped/"+name+time+".png");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String name=result.getName();
		Date today=Calendar.getInstance().getTime();
		String time=today.toString();
//		String time=Calendar.getInstance().getTime().toString();
		
		File dest= new File("D://Study/Auto/Eclipse/Selenium Class/Oct_1_PracticeGuru99/onFinish_ITestContext/"+name+time+".png");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void onTestSucess(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String name=result.getName();
		Date today=Calendar.getInstance().getTime();
		String time=today.toString();
//		String time=Calendar.getInstance().getTime().toString();
		
		File dest= new File("./onTestSucess/"+name+time+".png");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	

}
