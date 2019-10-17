package listenerssuitelevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRundemo {
	WebDriver driver;
	@Test
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");		
		driver.manage().window().maximize();
		System.out.println("Start application");
	}
	
	@Test(dependsOnMethods="startapp")
	public void checktitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Demo Web Shop");
	}
	@Test(dependsOnMethods="checktitle")
	public void loginapp()
	{
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		System.out.println("Successfully logged");
	}
	
	@Test(dependsOnMethods="loginapp")
	public void signoff()
	{
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("signoff successfully");
	}

	@Test(dependsOnMethods="signoff",alwaysRun=true)
	public void closebrowser()
	{
		driver.close();
	}
}
