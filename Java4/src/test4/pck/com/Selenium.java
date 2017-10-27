package test4.pck.com;

import java.net.MalformedURLException;
import java.net.URL;


//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Selenium {
   
	RemoteWebDriver driver;
			
		@Parameters("browserName")
		@BeforeTest
	    public void Setup(String browser) throws MalformedURLException{
		
		String browserName = browser;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(browserName);
		driver = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"),cap);
		driver.get("https://dev.tracko.co.in/trackoweb/index.html");
		
		}
		
}
