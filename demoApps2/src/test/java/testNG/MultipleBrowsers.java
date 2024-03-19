package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleBrowsers {
	
	WebDriver driver;
	
	@Test
	public void GoogleTest(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.google.co.in/");
		
		System.out.println("driver.getTitle()");
		
	}


}
