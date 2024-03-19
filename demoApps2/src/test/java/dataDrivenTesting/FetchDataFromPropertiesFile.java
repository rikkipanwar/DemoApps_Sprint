package dataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

public class FetchDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\panwa\\eclipse-workspace\\demoApps\\src\\test\\resources\\commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browserVar = prop.getProperty("browser");
		System.out.println(browserVar);
		
		String urlVar = prop.getProperty("url");
		System.out.println(urlVar);
		
		String emailVar = prop.getProperty("email");
		System.out.println(emailVar);
		
		String passwordVar = prop.getProperty("password");
		System.out.println(passwordVar);
	}

}
