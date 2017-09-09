package test1.pack.com;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	static String name = "selenium";
	int i = 100;
	public static void main(String[] args) {
		
		System.out.println("hello world");
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.quit();
		m();
		System.out.println(name);
		Selenium1 ref = new Selenium1();
		ref.m1();
		System.out.println(ref.i);
				}
	
	  public static void m()
       {
    	   System.out.println(" hi");
       }
       
       public void m1()

       {
System.out.println("new");
       }
}