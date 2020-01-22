package package2;

import org.testng.annotations.Test;

import package1.BrowserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ParallelExecution {
 WebDriver driver;
  @BeforeMethod
  @Parameters({"browser","baseurl"})
  public void preCondition(String browserName,String url) {
	  System.out.println("BeforeMethod");
	 driver=BrowserFactory.launchBrowser(browserName);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.get(url);
  }
  @Test
  public void validLogin() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager" +Keys.ENTER);
  }
}