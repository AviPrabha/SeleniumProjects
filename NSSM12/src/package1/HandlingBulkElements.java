package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingBulkElements {

	public static void main(String[] args) {
	
/*	
	WebDriver driver=BrowserFactory.launchBrowser("chrome");
	driver.get("https://www.seleniumhq.org/download/");
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int count=links.size();
	System.out.println("Total Links: "+count);
	
	*/
	
		
 	/*
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.get("https://istqb.in/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println("Total links: "+count);
		
		for (int i=0;i<count;i++) {
			WebElement link=allLinks.get(i);
			String linkText=link.getText();
			System.out.println(linkText);
		}
	
		
		*/
		
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.get("https://istqb.in/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println("Total links: "+count);
		int displayCount=0;
		int hiddenCount=0;
		for(int i=0;i<count;i++) {
			WebElement link=allLinks.get(i);
			boolean flag=link.isDisplayed();
			if(flag) {
				displayCount++;
				System.out.println(link.getText());
			}else {
				hiddenCount++;
			}
		}
		System.out.println("total links displayed: "+displayCount);
		System.out.println("Total links hidden: "+hiddenCount);
	}

}
