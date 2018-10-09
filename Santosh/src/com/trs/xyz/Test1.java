package com.trs.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver d;

	@Test
	public void f() {

		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.id("btnLogin")).click();
	

	}
	@Parameters("bro")
	@BeforeTest
	public void Setup(String ram)
	{
		if("chrome".equals(ram))
		{
			System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
			d = new ChromeDriver();
			
		}
		else if("IE".equals(ram))
		{
		System.setProperty("webdriver.ie.driver","Resources/IEDriverServer.exe");
		d = new InternetExplorerDriver();
		
		}
		else if("firefox".equals(ram))
		{
		System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe");
		d = new FirefoxDriver();
	
		}
		else
		{
			System.out.println("browser not available");
		}
		d.get("http://opensource.demo.orangehrmlive.com/");
	}

	@AfterTest
	public void afterTest() {
		d.close();
	}
}
