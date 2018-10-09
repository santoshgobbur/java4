package GRID;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S2 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement>Elements =driver.findElements(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[20]/strong/label"));
		System.out.println(Elements);
		
	}

}
