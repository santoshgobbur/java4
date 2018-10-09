package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {


	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("./ScreenShots/orangehrm.png"));
		
		System.out.println("screenshot taken"); 
		
	}

}
