package practiceHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import package1.BrowserFactory;

public class ViratKohli {

	public static void main(String[] args) {
		WebDriver driver = BrowserFactory.launchBrowser("chrome");
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		 WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		 searchBox.sendKeys("Virat kohli");
		 driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@class='gNO89b']")).click();
		 
		
		
		
		
		
		
	}

}
