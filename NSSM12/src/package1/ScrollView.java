package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollView {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=BrowserFactory.launchBrowser("chrome");
	driver.manage().window().maximize();
	driver.get("https://www.seleniumhq.org/");
	
	String jsCode="arguments[0].scrollIntoView(true)";
	String css="img[src*='applitools.png']";
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript(jsCode, driver.findElement(By.cssSelector(css)));
	
	Thread.sleep(3000);
	
	String jsCode2="arguments[0].click()";
	je.executeScript(jsCode2, driver.findElement(By.cssSelector(css)));
	
	}

}
