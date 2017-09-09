package com.org;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	
	public Login(ChromeDriver driver1){
		driver = driver1;
	}
	public void login(){
		
		driver.get("https://dev.tracko.co.in/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	}

}
