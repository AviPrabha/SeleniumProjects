package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=BrowserFactory.launchBrowser("chrome");
	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	
	driver.switchTo().frame("packageListFrame");
	String xp="//ul[@title='Packages']//a[text()='com.thoughtworks.selenium']";
	driver.findElement(By.xpath(xp)).click();
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
		
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("DefaultSelenium")).click();
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	
	//driver.switchTo().frame("classFrame");
	String frame3xp="//frame[@name='classFrame']";
	WebElement frame3=driver.findElement(By.xpath(frame3xp));
	driver.switchTo().frame(frame3);
	driver.findElement(By.linkText("WebDriverBackedSelenium")).click();
		
		
		
		
		
		
	}

}
