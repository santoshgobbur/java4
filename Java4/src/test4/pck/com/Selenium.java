package test4.pck.com;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		System.out.println("hi");
		ChromeDriver d = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		d.get("https://dev.tracko.co.in/trackoweb/index.html");

	}

}
