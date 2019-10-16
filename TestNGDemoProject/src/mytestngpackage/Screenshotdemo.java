package mytestngpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshotdemo {
	WebDriver driver;
	@Test
	public void checklogin() throws IOException{
	System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("rekhab");
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("D:\\Seleniumlp10software\\logintestscr.png"));
	
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.findElement(By.linkText("Log out")).click();
	driver.close();
	
}
}
