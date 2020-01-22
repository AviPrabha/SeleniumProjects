package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementDisplay {
	public static void VerifyElementDisplay(WebElement ele)
	{
		boolean flag=ele.isDisplayed();
		System.out.println(flag);
		if(flag) {
			System.out.println("Element is displayed");
		}else {
			System.out.println("Element is not diplayed");
		}
	}

		public static void main(String[] args) {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.get("https://istqb.in/");
		
		
		String xp="//div[@id='tmMainMenu']//a[text()=\"FOUNDATION\"]";
		WebElement foundation=driver.findElement(By.xpath(xp));
		
		
		String xp2="//a[text()='FOUNDATION']/following-sibling::div//a[text()='EXAM DATES']";
		WebElement examDates=driver.findElement(By.xpath(xp2));
		
		String xp3="//a[text()='FOUNDATION']/following-sibling::div//a[text()='PROCEDURE']";
		WebElement procedure=driver.findElement(By.xpath(xp3));
		
		String xp4="//a[text()='ADVANCED']/following-sibling::div//a[text()='SYLLABI']";
		WebElement syllabi=driver.findElement(By.xpath(xp4));
		
		String xp5="//div[@id='tmMainMenu']//a[text()=\"Automotive Tester\"]";
		WebElement AutomotiveTester=driver.findElement(By.xpath(xp5));
		
		
		VerifyElementDisplay(foundation); //true
		VerifyElementDisplay(examDates); //false
		VerifyElementDisplay(procedure); //false
		VerifyElementDisplay(syllabi); //false
		VerifyElementDisplay(AutomotiveTester); //true
		
	}

}
