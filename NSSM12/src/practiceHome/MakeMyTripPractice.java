package practiceHome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		Actions act=new Actions(driver);
		String xp = "//input[@id='fromCity']";
		WebElement src = driver.findElement(By.xpath(xp));
		Thread.sleep(2000);
		act.moveToElement(src).click().perform();
		act.sendKeys(src, "Delhi").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
	
		String xp2 = "//input[@id='toCity']";
		WebElement dest = driver.findElement(By.xpath(xp2));
		act.moveToElement(dest).click().perform();
		act.sendKeys(dest, "mumbai").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//div[@aria-label='Tue Apr 07 2020']")).click();
		
		
		
		
		
	}

}
