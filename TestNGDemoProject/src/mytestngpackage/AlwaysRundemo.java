package mytestngpackage;

import java.util.concurrent.TimeUnit;

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
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Start application");
	}

	@Test(dependsOnMethods="startapp")
	public void checkurl(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "google");
	}

	@Test(dependsOnMethods="checkurl",alwaysRun=true)
	public void signoff()
	{
		driver.quit();
	}
}
