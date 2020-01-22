package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollDownAndUp {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=BrowserFactory.launchBrowser("chrome");
	driver.get("https:www.seleniumhq.org/");
	
	JavascriptExecutor je=(JavascriptExecutor)driver;
	String jsCode1="window.scrollBy(0,document.body.scrollHeight)";
	je.executeScript(jsCode1);
	
	Thread.sleep(1000);
		
	String jsCode2="window.scrollBy(0,-1000)";
	je.executeScript(jsCode2);
		
		
		
		
		
	}

}
