package generics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelLibrary implements AutoConstant{
	
public static String value(String sheet, int row, int cell) throws IOException
{
FileInputStream fis=new FileInputStream(ecxel);

XSSFWorkbook wb=new XSSFWorkbook(fis);//from apache poi
Sheet s=wb.getSheet(sheet);
Row r=s.getRow(row);
Cell c=r.getCell(cell);

return c.getStringCellValue();


	
	
}

}
