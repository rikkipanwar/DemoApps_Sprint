package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
	
	
	@Test
	public void Facebook( ) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.faceook.com/");
		
		System.out.println(driver.getTitle());

	}

}
