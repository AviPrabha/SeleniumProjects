package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FileDownloadPopup {

	public static void main(String[] args) {
		String key="browser.helperApps.neverAsk.saveToDisk;";
		String value="application/zip";
		
	FirefoxOptions options=new FirefoxOptions();
	options.addArguments(key,value);
	System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://selenium.dev/downloads/");
	driver.findElement(By.partialLinkText("32 bit Windows IE")).click();
	}
}