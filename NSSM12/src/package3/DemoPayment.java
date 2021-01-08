package package3;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import package1.BrowserFactory;


public class DemoPayment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.midtrans.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='BUY NOW']")).click();
		driver.findElement(By.xpath("//div[text()='CHECKOUT']")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("snap-midtrans")));
		driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Credit Card']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys("4811111111111114");
		driver.findElement(By.xpath("//input[@placeholder='MM / YY']")).sendKeys("0220");
		driver.findElement(By.xpath("//input[@placeholder='123']")).sendKeys("123");
		driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'veritrans')]")));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("112233");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.close();
	}
}
