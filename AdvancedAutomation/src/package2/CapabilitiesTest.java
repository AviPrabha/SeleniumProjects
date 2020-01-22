package package2;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;




public class CapabilitiesTest {

	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",dir+"/exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //UPCASTING
		
		RemoteWebDriver rwd=(RemoteWebDriver) driver;   //DOWNCASTING
		Capabilities cap = rwd.getCapabilities();
		String browserName = cap.getBrowserName();
		 System.out.println(browserName);
		
		String platformName = cap.getPlatform().toString();
		System.out.println(platformName);
		driver.close();
	}
}
	