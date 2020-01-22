package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchBrowser {
@BeforeMethod
public void preCondition() {
	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Driver.setDriver(driver);
}
	
@Test
public void test() {
	Driver.getDriver().get("https://www.facebook.com");
}	
}
