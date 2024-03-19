package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGenerateStaleElementRefException {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		
		GoogleSearchPage search = new GoogleSearchPage(driver);
		
		search.searchQuerry("Java");
		
		search.searchQuerry("Automation");

	}

}
