package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class F1 {
	
	public WebDriver driver;

@Given("^I have site$")
public void i_have_site() throws InterruptedException {
         
	/*System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	driver = new ChromeDriver();*/
	System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
	driver = new FirefoxDriver();
	Thread.sleep(5000);
	driver.get("http://opensource.demo.orangehrmlive.com/");
}

@When("^I enter username and password$")
public void i_enter_username_and_password()  {
	

	WebElement un = driver.findElement(By.id("txtUsername"));
	un.sendKeys("Admin");
	WebElement pwd=driver.findElement(By.id("txtPassword"));
	pwd.sendKeys("admin");
	
}

@Then("^I should get logged in$")
public void i_should_get_logged_in()  {
   
	WebElement btn=driver.findElement(By.id("btnLogin"));
	btn.click();
}	

}
