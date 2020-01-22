package package1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OtherDownloadPopup {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.autoitscript.com/site/autoit/downloads/");
		
	String css="img[title='Download AutoIt']";
		String jsCode="arguments[0].scrollIntoView(true)";
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript(jsCode, driver.findElement(By.cssSelector(css)));
		String jsCode2 = "arguments[0].click()";
		je.executeScript(jsCode2, driver.findElement(By.cssSelector(css)));
		try {
			Runtime.getRuntime().exec("C:/Users/AviPrabha/Desktop/AutoITDownload.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
