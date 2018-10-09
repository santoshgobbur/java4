package scp.in;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NW1{
       
	static WebDriver driver;
		public static void main(String[] args) {
	       
			System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/");
			String currentURL=driver.getCurrentUrl();
			System.out.println(currentURL);
		}
}
