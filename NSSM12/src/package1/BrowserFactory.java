package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver launchBrowser(String browserName) {
	WebDriver driver=null;
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe" );
		driver=new ChromeDriver();
		System.out.println("chrome Launched");
		
	}
	else if(browserName.equalsIgnoreCase("firefox")) 
	{
		System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Firefox launched");
		
	}
	else if(browserName.equalsIgnoreCase("ie")) 
	{
		System.setProperty("webdriver.ie.driver","./exefiles/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		System.out.println("Internet Explorer launched");
		
	}
	else if(browserName.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver","./exefiles/MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		System.out.println("Microsoft Edge Launched");
	}
	return driver;
	}

}
