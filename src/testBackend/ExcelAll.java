package testBackend;


import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import generics.BasePage;

public class ExcelAll extends BasePage {
	@Test(priority = 1)
	public void login() throws AWTException, InterruptedException, IOException
	{
		//obtaining input bytes from a file  
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\LENOVO\\Desktop\\A.xlsx"));  
		//creating workbook instance that refers to .xls file  
		XSSFWorkbook wb= new XSSFWorkbook(fis); 
		
//Workbook wb=WorkbookFactory.create(fis,"0000");		
		//creating a Sheet object to retrieve the object  
		Sheet sheet=wb.getSheetAt(0);  
		//evaluating cell type   
		for(Row row: sheet)     //iteration over row using for each loop  
		{  
			for(Cell cell: row)    //iteration over cell using for each loop  
			{  
				switch(cell.getCellType())  
				{  
				case NUMERIC:   //field that represents numeric cell type  
				//getting the value of the cell as a number  
				System.out.print(cell.getNumericCellValue()+ "		");   
				break;  
				case STRING:    //field that represents string cell type  
				//getting the value of the cell as a string  
				System.out.print(cell.getStringCellValue()+ "		");  
				break;
				default:
					break;
				
				}  
			}  
		System.out.println();  
		} 
	}
	}
	
	
