package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		String xp="//div[@id='banner']//a[starts-with(text(),'CONTINUE')]";
		driver.findElement(By.xpath(xp)).click();
		
		driver.findElement(By.id("Button2")).click();
		
		Alert alt = driver.switchTo().alert();
		String alertMsg = alt.getText();
		System.out.println(alertMsg);
		alt.accept();                //To click OK on popup
		
		driver.findElement(By.id("username")).sendKeys("admin"); //to check,where is driver control.
	}

}
