package myTestngpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {

WebDriver driver;
@Before
public void setbrowser(){
	System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");		
	driver.manage().window().maximize();
}
	
@Test
public void login(){
	driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("rekhab");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
}

@After
public void logoff(){
	driver.findElement(By.linkText("Log out")).click();
	driver.close();
}
	
}
