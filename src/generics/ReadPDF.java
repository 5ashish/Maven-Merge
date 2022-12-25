package generics;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPDF {

    WebDriver driver;

    String pdfUrl ="https://cloud.google.com/docs/security/infrastructure/design/resources/google_infrastructure_whitepaper_fa.pdf";    

    @BeforeTest

    public void setUp() 
{
     WebDriverManager.chromedriver().setup();

     driver=new ChromeDriver();
     driver.manage().window().maximize();

     driver.get(pdfUrl);

    }    

    @Test

    public void verifyTextFromPDF() {     

     try {

     String pdfContent=getPdfContent(pdfUrl);

     Assert.assertTrue(pdfContent.contains("Secure low-level infrastructure"));

     Assert.assertTrue(pdfContent.contains("Security of physical premises"));

     } catch (IOException e) {

     // TODO Auto-generated catch block

     e.printStackTrace();

     }     

    }    

    public static String getPdfContent(String url) throws IOException {

     URL pdfURL=new URL(url);

     InputStream is=pdfURL.openStream();

     BufferedInputStream bis=new BufferedInputStream(is);

     PDDocument doc=PDDocument.load(bis);

     int pages=doc.getNumberOfPages();

     System.out.println("The total number of pages "+pages);

     PDFTextStripper strip=new PDFTextStripper();

     strip.setStartPage(1);

     strip.setEndPage(2);

     String stripText=strip.getText(doc);

     System.out.println(stripText);

     doc.close();

     return stripText;

    }   

}