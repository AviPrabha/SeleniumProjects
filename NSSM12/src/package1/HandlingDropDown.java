package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
		WebElement drpDwn=driver.findElement(By.name("Country"));
		Select sel=new Select(drpDwn);
		//sel.selectByIndex(2);
		      //or
		//sel.selectByValue(3);
		      //or
		sel.selectByVisibleText("India");
	}

}