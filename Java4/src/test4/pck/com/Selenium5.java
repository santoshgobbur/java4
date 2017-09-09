package test4.pck.com;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium5 {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.ie.driver","Resources/IEDriverServer.exe");
		System.out.println("hello");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://davehaeffner.com/");
		
		}
}		
	
	   
