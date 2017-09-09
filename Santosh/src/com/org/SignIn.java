package com.org;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
	
	ChromeDriver driver;
	
	public SignIn(ChromeDriver driver2){
		driver = driver2;
	}
	
	
	public void signin1(){
		
		driver.findElement(By.id("login-mobile")).sendKeys("9545635856");
		driver.findElement(By.id("login-password")).sendKeys("s654321");
		driver.findElement(By.id("sub_btn")).click();
	}

}
