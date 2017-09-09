package com.org;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	ChromeDriver driver;
	
	public SignUp(ChromeDriver driver4){
		
		driver = driver4;
	}
	
	public void signup(){
		
		driver.findElement(By.id("name")).sendKeys("santosh");
		driver.findElement(By.id("email")).sendKeys("santoshgobbur@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("9545635856");
		driver.findElement(By.id("sub_btn_signup")).click();
		
		
	}
} 

