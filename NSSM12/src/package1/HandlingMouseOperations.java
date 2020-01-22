package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String xp="//span[text()='Home & Furniture']";
		WebElement homeNFur=driver.findElement(By.xpath(xp));
		Actions act=new Actions(driver);
		act.moveToElement(homeNFur).perform();
		
		Thread.sleep(3000);
		WebElement stickers=driver.findElement(By.linkText("Stickers"));
		act.click(stickers).perform();
		Thread.sleep(9000);
		
		String xp2="//div[@class='_3G9WVX _2N3EuE']";
		WebElement rightSlider=driver.findElement(By.xpath(xp2));
		act.clickAndHold(rightSlider).perform();
		act.moveByOffset(-90, 0).perform();
		WebElement searchTxtBx=driver.findElement(By.name("q"));
		act.sendKeys(searchTxtBx, "Samsung Galaxy").perform();
		
		Thread.sleep(4000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();	
	}


}
