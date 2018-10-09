package com.scp.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']/b")).click();
		driver.findElement(By.xpath(".//*[@id='ohrmList_chkSelectRecord_6']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='ohrmList_chkSelectRecord_6']")).click();

	}
	
	

}
