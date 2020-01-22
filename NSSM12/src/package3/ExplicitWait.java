package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import package1.BrowserFactory;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("(//a[text()='Login'])[3]")).click();
		String xp="//button[starts-with(text(),'Business')]";
		
	    WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement bUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp)));
		bUser.click();
		
		driver.findElement(By.id("loginemail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		String xp2="//label[text()='Email']/following-sibling::label";
		String expMsg="Please login using the OTP option";
		Boolean flag = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xp2), expMsg));
		System.out.println(flag);
		if (flag)    //true
		{
			String actualMsg = driver.findElement(By.xpath(xp2)).getText();
			System.out.println(actualMsg);
		}
		else {
			System.out.println("Text Not Present");
		}	
	}
}
