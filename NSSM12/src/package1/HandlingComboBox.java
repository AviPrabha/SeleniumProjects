package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingComboBox {

	public static void main(String[] args) {
	WebDriver driver=BrowserFactory.launchBrowser("chrome");
	driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
	WebElement drpDwn=driver.findElement(By.name("Courses"));
	List<WebElement> options = drpDwn.findElements(By.tagName("option"));
	int count=options.size();
	System.out.println("Total options: "+count);
	for (int i = 0; i < count; i++) {
		WebElement option=options.get(i);
		String optionText=option.getText();
		System.out.println(optionText);
		option.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
