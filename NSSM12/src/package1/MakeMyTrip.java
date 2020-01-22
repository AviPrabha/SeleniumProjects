package package1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		
		String xp="//input[@id='fromCity']";
		WebElement src=driver.findElement(By.xpath(xp));
		Actions act=new Actions(driver);
		act.moveToElement(src).click().perform();
		act.sendKeys(src,"delhi").perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		
		String xp2="//div[@class='fsw_inputBox searchToCity inactiveWidget activeWidget']";
		WebElement dest=driver.findElement(By.xpath(xp2));
		Thread.sleep(2000);
		act.moveToElement(dest).click().perform();
		act.sendKeys(dest,"bengaluru").perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		String xp3="//div[@aria-label='Fri Nov 01 2019']";
		WebElement dateOfJourney=driver.findElement(By.xpath(xp3));
		act.moveToElement(dateOfJourney).click().perform();
		act.click().perform();
		
		String xp4="//a[text()=\"Search\"]";
		WebElement search=driver.findElement(By.xpath(xp4));
		act.moveToElement(search).click().perform();
		
		Thread.sleep(3000);
		String xp5="//button[text()='Book Now'][1]";
		WebElement bookNow=driver.findElement(By.xpath(xp5));
		act.click(bookNow).perform();
		
		
		Set<String> sessions = driver.getWindowHandles();
		Iterator<String> itr = sessions.iterator();
		String parentTab = itr.next();
		String childTab = itr.next();
		driver.switchTo().window(childTab);
	
		
		
		
		//act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		String xp6 = "//span[text()='₹ 5,860']";
		String fare = driver.findElement(By.xpath(xp6)).getText();
		System.out.println("Total Fare is: "+fare);
		
		
	}

}
