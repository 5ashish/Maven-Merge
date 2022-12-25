package testBackend;


import java.awt.AWTException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import generics.BasePage;

public class CreateExcel extends BasePage {
	@Test(priority = 1)
	public void login() throws AWTException, InterruptedException, IOException
	{
		//creating an instance of Workbook class   
		Workbook wb = new XSSFWorkbook();
		//creates an excel file at the specified location  
			OutputStream fileOut = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\1.xlsx");   
			System.out.println("Excel File has been created successfully.");   
			wb.write(fileOut);
			
		
		   
	}
	}
	
	
