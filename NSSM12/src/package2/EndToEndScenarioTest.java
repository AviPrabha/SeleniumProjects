package package2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class EndToEndScenarioTest {
  
	WebDriver driver;
  @BeforeClass
  public void setUp() {
	  System.out.println("Before Class");
	  System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("http://desktop-v3tcd3d/login.do");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  }

  @AfterClass
  public void tearDown() {
	  System.out.println("After Class");
  }
  @Test
  public void createNewCustomer() {
  System.out.println("Creating Customer");
  driver.findElement(By.xpath("//div[contains(text(),'Tasks')]")).click();
	driver.findElement(By.linkText("Projects & Customers")).click();
	driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	driver.findElement(By.name("name")).sendKeys("AviKashyap");
	driver.findElement(By.name("createCustomerSubmit")).click();
	System.out.println("Customer Created");
  }
  @Test(dependsOnMethods= {"createNewCustomer"})
  public void createNewProject() {
	  System.out.println("Creating Project");
	  driver.findElement(By.cssSelector("input[value='Create New Project']")).click();
	  WebElement custDrpDwn=driver.findElement(By.cssSelector("select[name='customerId']"));
	  Select sel=new Select(custDrpDwn);
	  sel.selectByVisibleText("AviKashyap");
	  driver.findElement(By.name("name")).sendKeys("Testing");
	  driver.findElement(By.name("createProjectSubmit")).click();
	  System.out.println("Project Created");
  }
  
  @Test(dependsOnMethods= {"createNewCustomer"})
  public void createNewTask() {
	  System.out.println("Creating New Task");
	  driver.findElement(By.xpath("//a[text()='Open Tasks']")).click();
	  driver.findElement(By.cssSelector("input[value='Create New Tasks']")).click();
	  WebElement custDrpDwn1=driver.findElement(By.xpath("//select[@name='customerId']"));
	  Select sel=new Select(custDrpDwn1);
	  sel.selectByVisibleText("AviKashyap");  
	  
	 WebElement proDrpDwn=driver.findElement(By.name("projectId"));
	 Select sel1=new Select(proDrpDwn);
	 sel1.selectByVisibleText("Testing");
	 driver.findElement(By.name("task[0].name")).sendKeys("First Task");
	 driver.findElement(By.cssSelector("input[value='Create Tasks']")).click();	  
  } 
}