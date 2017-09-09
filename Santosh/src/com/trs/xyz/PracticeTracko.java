package com.trs.xyz;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeTracko {

	ChromeDriver driver;
	@BeforeTest
	public void SetUp(){

		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev.tracko.co.in/");
	}
    
	@Test(dataProvider="mix")
	public void Click(String a, String b) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.id("login-mobile")).sendKeys(a);
		driver.findElement(By.id("login-password")).sendKeys(b);
		driver.findElement(By.id("sub_btn")).click();
		//d.findElement(By.xpath("//a[@class='btn btn-sm btn-block btn-cta-primary' and @href='product_details.html?modelId=1']")).click();
	   
		Thread.sleep (8000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Details')]")).click();
		
		driver.manage().window().maximize();
		
		Thread.sleep (5000);
		driver.findElement(By.xpath("//a[@onclick='orderProduct();']")).click();
		
		driver.findElement(By.id("cmbPlans")).click();
	}
	
	@DataProvider(name="mix")
	public Object Sign(){
		
		return new Object[][]
				{
				new Object[] {"9545635856","s654321"},
				};
	}
	
}	
	
	
	
	
