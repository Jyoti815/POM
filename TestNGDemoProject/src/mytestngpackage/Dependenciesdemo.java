package mytestngpackage;

import org.testng.annotations.Test;

public class Dependenciesdemo {
	@Test
	public void startapp()
	{
		System.out.println("Start application");
	}
	
	@Test(dependsOnMethods="startapp")
	public void loginapp()
	{
		System.out.println("Successfully logged");
	}
	
	@Test(dependsOnMethods="loginapp")
	public void signoff()
	{
		System.out.println("Signed off successfully");
	}
}
