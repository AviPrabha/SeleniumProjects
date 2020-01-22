package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CompanyNames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://istqb.in/");
		
		Actions act=new Actions(driver);
		
		WebElement aboutUs=driver.findElement(By.linkText("ABOUT US"));
		act.moveToElement(aboutUs).perform();
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='tmMainMenu']//a[text()='AFFILIATED COMPANIES']")).click();
		
		String xp2;
		
		for(char i='A';i<='Z';i++) {
			driver.findElement(By.xpath("//a[text()='"+ i +"']")).click();
			xp2="//div[@class='tm-middle uk-grid']//a[starts-with(text(),'"+i+"')]";
			List<WebElement> allElements = driver.findElements(By.xpath(xp2));
			
			int count=allElements.size();
			System.out.println(count);
			
			for (int j = 0; j < count; j++) {
				WebElement option=allElements.get(j);
				System.out.println(option.getText());
			}
			
			
		}
	}

}
