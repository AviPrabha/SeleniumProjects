package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FEvsFEs {

	public static void main(String[] args) {
	WebDriver driver=BrowserFactory.launchBrowser("chrome");
	driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
	
	List<WebElement> wbs = driver.findElements(By.tagName("span"));
	boolean flag=wbs.isEmpty();
	System.out.println(flag);
	if(flag) {
		System.out.println("Empty list: "+wbs.size());
	}else {
		System.out.println("list is not empty "+wbs.size());
	}
	driver.findElement(By.tagName("span")); //exception
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
