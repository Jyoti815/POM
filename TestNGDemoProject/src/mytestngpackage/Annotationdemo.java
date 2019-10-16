package mytestngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationdemo {
@BeforeSuite
public void setproperty(){
	System.out.println("Set the system property");
}

@BeforeTest
public void launchBrowser(){
	System.out.println("Open the browser");
}

	@BeforeClass
public void enterurl(){
	System.out.println("Open url");
}

		@BeforeMethod
		public void geturl(){
			System.out.println("display url");
		}
		
			@Test
			public void checktitle(){
				System.out.println("Check title of page");
			}
		
		@AfterMethod
		public void logout(){
			System.out.println("logout");
		}
	
		
	@AfterClass
	public void closebrowser()
	{
		System.out.println("close broswer");
	}
	
}
