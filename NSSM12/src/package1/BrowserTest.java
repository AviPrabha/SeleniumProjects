package package1;

import org.openqa.selenium.WebDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=BrowserFactory.launchBrowser("chrome");
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
	driver.navigate().to("https://www.seleniumhq.org");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	}

}
