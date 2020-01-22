package package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import package1.BrowserFactory;

public class LoginTest {
	 
	WebDriver driver;
	 
	  @BeforeMethod
	  public void preCondition() {
		 System.out.println("BeforeMethod");
		 driver=BrowserFactory.launchBrowser(System.getProperty("browser"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get(System.getProperty("url"));
	  }
	  @Test
	  public void validLogin() {
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager" +Keys.ENTER);
	  }
	}
