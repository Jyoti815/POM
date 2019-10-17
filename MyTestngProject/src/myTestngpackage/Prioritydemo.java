package myTestngpackage;

import org.testng.annotations.Test;



public class Prioritydemo {
	@Test(description="Test case to open application")
	public void startapp(){
		System.out.println("Start application");
	}
	
	@Test(priority=1,description="Test case to verify login functionality")
	public void loginapp(){
		System.out.println("Successfully logged");
	}
	
	@Test(priority=2,description="Test case to verify sign off")
	public void signoff(){
		System.out.println("sign of successfully");
	}
	
	
	
	
}
