package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ViratKohli {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String xp = "//input[@class='gLFyf gsfi']";
		WebElement searchTxtBx=driver.findElement(By.xpath(xp));

		Actions act=new Actions(driver);
		act.sendKeys(searchTxtBx,"virat kohli ").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
		String xp2="//div[@class='HwtpBd gsrt PZPZlf kno-fb-ctx']";
		String ageNDOB = driver.findElement(By.xpath(xp2)).getText();
		System.out.println(ageNDOB);
	}

}
