package mytestngpackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportdemo {
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	
	@Test
	public void checktitle(){
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/Myextentreport.html",true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test=extent.startTest("First test");
		if(driver.getTitle().equals("google"))
		{
			test.log(LogStatus.PASS, "Correct Page");
		}
		else
		{
			
			test.log(LogStatus.FAIL, "Incorrect page");
		}
		extent.endTest(test);
		extent.flush();
		extent.close();
	}
	
}
