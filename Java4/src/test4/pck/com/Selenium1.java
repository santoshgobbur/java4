package test4.pck.com;

import org.openqa.selenium.By;



import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium1 {

	public static void main(String[] args){
		
		System.out.println("hi");
	    System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		d.findElement(By.id("email")).sendKeys("abc");
		d.findElement(By.id("pass")).sendKeys("123");
		d.findElement(By.id("loginbutton")).click();
		//d.quit();
	}
}