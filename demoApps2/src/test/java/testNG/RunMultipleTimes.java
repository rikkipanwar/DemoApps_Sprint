package testNG;

import org.testng.annotations.Test;

public class RunMultipleTimes {
	
	@Test(priority = 1)
	public void login() {
		System.out.println("The user has logged in");
	}
	
	@Test(priority = 2)
	public void searchProduct() {
		System.out.println("The product is searched");
	}
	
	@Test(priority = 3, invocationCount = 5)
	public void addToCart() {
		System.out.println("The product A is addded to cart");
	}
	
	@Test(priority = 4)
	public void payment() {
		System.out.println("The product is paid");
	}
	
	@Test(priority = 5)
	public void logout() {
		System.out.println("The user has logeed out");
	}
	

}
