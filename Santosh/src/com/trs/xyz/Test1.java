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

		d.findElement(By.xpath("//a[contains( text(),'Log in')]")).click();
		d.findElement(By.id("login-mobile")).sendKeys("9545635856");
		d.findElement(By.id("login-password")).sendKeys("654321");
	

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
		d.get("https://en-gb.facebook.com/login/");
	}

	@AfterTest
	public void afterTest() {
		d.quit();
	}
}
