package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


public class BrowserFactory
{

	public static WebDriver launchBrowser(String browserName)
	{
	WebDriver driver=null;
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe" );
		driver=new ChromeDriver();
		Reporter.log("Chrome Browser Launched",true);
		
	}
	else if(browserName.equalsIgnoreCase("firefox")) 
	{
		System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
		driver=new FirefoxDriver();
		Reporter.log("Firefox Browser launched",true);
		
	}
	return driver;
	}

}