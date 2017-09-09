package com.trs.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewJavaTest5 {
	
	ChromeDriver d;
	
	@BeforeTest
	public void Setup(){
		
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://en-gb.facebook.com/login/");
	}
	
	@Test(dataProvider="mix")
	public void LogIn(String a,String b){
		d.findElement(By.id("email")).sendKeys(a);
		d.findElement(By.id("pass")).sendKeys(b);
		d.findElement(By.id("email")).clear();
		d.findElement(By.id("pass")).clear();
	}
	
	@DataProvider(name="mix")
	public Object [][] text(){
	
		return new Object[][]
				{
				new Object [] { "santosh","santosh123" },
				new Object [] { "John","john123" },
				new Object [] { "Ram","Ram456" },
				};
	}
	@AfterTest
	public void Close(){
		d.quit();
	}
}