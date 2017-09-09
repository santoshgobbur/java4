package com.trs.xyz;

//import org.junit.Before;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest2 {
  
	ChromeDriver d;
	
  @Test
  public void f() {
	  
	  d.findElement(By.xpath("//a[contains( text(),'Log in')]")).click();
	  d.findElement(By.id("login-mobile")).sendKeys("9545635856");
	  d.findElement(By.id("login-password")).sendKeys("654321");
	  d.findElement(By.id("sub_btn")).click();
	 
  }
   @BeforeTest
   public void BeforeTest()
   {
	 
       System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
       d = new ChromeDriver();
       d.get("https://dev.tracko.co.in");
  }

  @AfterTest
  public void afterTest() {
	  d.quit();
  }

}
