package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=BrowserFactory.launchBrowser("Chrome");
		driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
		//By by=By.id("user");
		//WebElement unTxtBx=driver.findElement(by);
		//unTxtBx.sendKeys("abcd");
		
		//or
		
		//WebElement unTxtBx=driver.findElement(By.id("user"));
		//unTxtBx.sendKeys("xyz");
		
		//or
		
		driver.findElement(By.id("user")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("12345678");
		driver.findElement(By.className("MyCheckbox")).click();;
		driver.findElement(By.className("male")).click();
		
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.linkText("edit this page")).click();
		driver.findElement(By.partialLinkText("Forgot pass")).click();
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		driver.findElement(By.className("female")).click();
	
	}

}
