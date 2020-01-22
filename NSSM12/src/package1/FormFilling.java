package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormFilling {

	public static void main(String[] args) {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
		
		List<WebElement> wbs = driver.findElements(By.tagName("input"));
		wbs.get(0).sendKeys("admin");
		wbs.get(1).sendKeys("12345");
		wbs.get(2).click();
		wbs.get(4).click();
		wbs.get(3).click();
		
	}

}
