package package2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import package1.BrowserFactory;

public class HardAssertTest {
  @Test
  public void invalidLogin() {
	  WebDriver driver=BrowserFactory.launchBrowser("chrome");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("http://127.0.0.1/login.do");
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("12345");
	  driver.findElement(By.id("loginButton")).click();
	  
	  String expectedMsg="Username or Password is invalid. Please try again.";
	  String xp="//div[@id='ServerSideErrorMessage']//span";
	  String actualMsg=driver.findElement(By.xpath(xp)).getText();
	  
	  Assert.assertEquals(actualMsg, expectedMsg);
	  Reporter.log("Invalid Login msg is verified",true);
  }
}
