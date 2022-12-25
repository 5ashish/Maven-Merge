package testBackend;


import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import generics.BasePage;

public class TextsFromFile extends BasePage {
	@Test(priority = 1)
	public void login() throws AWTException, InterruptedException, IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\Baba1.xlsx"));
		String line = in.readLine();
		while(line != null)
		{
		  System.out.println(line);
		  line = in.readLine();
		}
		in.close();
	}
	}
	
	
