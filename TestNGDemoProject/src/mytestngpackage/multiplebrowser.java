package mytestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiplebrowser {
	WebDriver driver;	
@BeforeTest	
@Parameters("browser")
public void setup(String browser) throws Exception{

	if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","D:\\Seleniumlp10software\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
	}
	
	else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else{
		throw new Exception("Browser is not correct");
	}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@Test
public void login() throws InterruptedException{
	driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("rekhab");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.findElement(By.linkText("Log out")).click();
}
@AfterTest
public void endtest(){
	driver.quit();
}


}
