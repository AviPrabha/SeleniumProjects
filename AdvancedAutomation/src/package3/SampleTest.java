package package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)
public class SampleTest 
{
@Test
	public void demo() {
		System.out.println("demo script");
	}

@Test
public void login() 
{
	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	WebDriver wDriver=new ChromeDriver();
	EventFiringWebDriver driver=new EventFiringWebDriver(wDriver);
	driver.register(new MyTestListener());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do");
	driver.findElement(By.id("aaaa"));
 }

@Test(dependsOnMethods = {"login"})
public void sample() 
{
	System.out.println("Sample script");
}

}