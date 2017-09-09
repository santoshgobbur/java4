package com.org;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Product {
	
	ChromeDriver driver;
	
	public Product(ChromeDriver driver3){
		driver = driver3;
	}
	
	public void product() throws InterruptedException {
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'Details')]")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@onclick='orderProduct();']")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		//driver.findElement(By.id("cmbPlans")).click();
		
		Select plan = new Select(driver.findElement(By.id("cmbPlans")));
		plan.selectByVisibleText("WELCOMEPLAN");
		plan.selectByIndex(1);
		
		Thread.sleep(5000);
		driver.findElement(By.id("qid")).click();
		//driver.findElement(By.xpath("//*[@id='qid']")).sendKeys(1);
		
		
		
		
		
		
	}
}
