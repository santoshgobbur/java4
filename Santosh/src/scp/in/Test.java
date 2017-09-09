package scp.in;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Wait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://dev.tracko.co.in/");
		//d.findElement(By.xpath("//a[@href='trackoweb/index.html']")).click();
		//d.findElement(By.xpath("//a[@href='trackoweb/signup.html']")).click();
		d.findElement(By.xpath("//a[text()='Log in']")).click();
		d.findElement(By.id("login-mobile")).sendKeys("9545635856");
		d.findElement(By.id("login-password")).sendKeys("654321");
		d.findElement(By.id("sub_btn")).click();
	   
		//d.findElement(By.xpath("//button[text()='Sign up']")).click();
	   // d.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		//d.findElement(By.xpath("//button[starts-with(text(),'Sign up')]")).click();
		//d.findElement(By.cssSelector("button[type^='but'][id='sub_btn_signup']")).click();
		//d.findElementBByCssSelector("button[type^='but']")).click();
		//d.findElement(By.cssSelector("button[onclick^='sign']")).click();
		//d.findElement(By.cssSelector("button[onclick*='sig']")).click();
		//d.findElement(By.xpath("//a[starts-with(text(),'Link Device')]")).click();
		
		
		
		//Thread.sleep(5000);
		//d.quit();
	}
}
