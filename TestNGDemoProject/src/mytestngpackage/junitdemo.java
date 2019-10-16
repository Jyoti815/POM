package mytestngpackage;
import java.util.concurrent.TimeUnit;
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
}
	
@Test
public void login(){
	driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("rekhab");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Log out")).click();
}

@After
public void closebrowser()
{
	driver.quit();
}


}
