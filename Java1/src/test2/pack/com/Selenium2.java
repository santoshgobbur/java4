package test2.pack.com;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium2 {

	public static void main(String[] args) {
		
		System.out.println("hello");
		System.setProperty("webdriver.ie.driver", "Resources/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
	    driver.get("http://docs.seleniumhq.org/download/");
		
	}

}
