package mytestngpackage;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test
	public void startapp()
	{
		System.out.println("Start application");
	}
	
	@Test(priority=1,description="Test case to verify login functionality")
	public void loginapp()
	{
		System.out.println("Successfully logged");
	}
	
	@Test
	public void signoff()
	{
		System.out.println("Signed off successfully");
	}
	
	
}
