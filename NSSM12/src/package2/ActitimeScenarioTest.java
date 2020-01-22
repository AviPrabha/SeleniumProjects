package package2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ActitimeScenarioTest {
 WebDriver driver;
  @BeforeMethod
  public void preCondition() {
	  System.out.println("Before Method");
	  System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("http://desktop-v3tcd3d/login.do");
  }

  @AfterMethod
  public void postCondition() {
	  System.out.println("After Method");
	  driver.close();
  }
  @Test(priority=1)
  public void validLogin() {
	System.out.println("Valid Login");  
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Tasks')]")).click();
	driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	driver.findElement(By.name("name")).sendKeys("AviPrabha");
	driver.findElement(By.name("createCustomerSubmit")).click();
  }
  
  @Test(priority=2)
  public void invalidLogin() {
	  System.out.println("Invalid Login");  
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		driver.findElement(By.id("loginButton")).click();
  }
}
