package myTestngpackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependenciesdemo {
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
		driver.close();
		System.out.println("signoff successfully");
	}

}
