package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WithoutSendKeys {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
	String jsCode="arguments[0].setAttribute('value','admin')";
	JavascriptExecutor je=(JavascriptExecutor) driver;
	je.executeScript(jsCode, driver.findElement(By.id("user")));
	}
}
