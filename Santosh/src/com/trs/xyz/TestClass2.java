package com.trs.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass2 {
  
  ChromeDriver d;
	
  @BeforeTest
  public void SetUp(){
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://en-gb.facebook.com/login/");
  }
	
  @Test(dataProvider="mix")
  public void f(String x,String y ) {
	  d.findElement(By.id("email")).sendKeys(x);
	  d.findElement(By.id("pass")).sendKeys(y);
  }

  @DataProvider(name ="mix")
  public Object[][] LoginCredentials(){
	  
	  return new Object[][]
			  {
			  new Object[]{"santosh","santosh123"},
			  };
	  
  }
}



