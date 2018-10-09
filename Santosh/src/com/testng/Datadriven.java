package com.testng;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class Datadriven {
 WebDriver driver;
 
 @Test(dataProvider="testdata")
  public void LoginOrangeHRM (String Username,String Password){
	  
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  driver.findElement(By.id("txtUsername")).sendKeys(Username);
	  driver.findElement(By.id("txtPassword")).sendKeys(Password);
	  driver.findElement(By.id("btnLogin")).click();
	  	  
  }
 
  @DataProvider(name="testdata")
  public Object [][] readexcel() throws BiffException, IOException {
	  
	  File f = new File ("Resources/Book1.xlsx");
	  Workbook w = Workbook.getWorkbook(f);
	  Sheet s = w.getSheet("Sheet1");
	  int rows = s.getRows();
	  int columns = s.getColumns();
	  String inputdata [][] = new String[rows][columns];
	  
	  for (int i=0; i<rows; i++)
	  {
		  for (int j=0; j<columns; j++)
		  {
			  Cell c = s.getCell(j,i);
			  inputdata [i][j] = c.getContents();
			  //System.out.println("inputdata [i][j]");
		  }
	  }
	return inputdata;
	  
}
}