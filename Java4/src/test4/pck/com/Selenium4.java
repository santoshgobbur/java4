package test4.pck.com;

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium4 {

	public static void main(String[] args){
		
		System.out.println("hi");
	    System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		String title = d.getTitle();
		System.out.println(title);
		d.get("https://dev.tracko.co.in/trackoweb/index.html");
		d.findElement(By.id("login-mobile")).sendKeys("9545635856");
		d.findElement(By.id("login-password")).sendKeys("s654321");
		d.findElement(By.id("sub_btn")).click();
		
		
		
		//d.navigate().back();
		
	}
}
	    
		
