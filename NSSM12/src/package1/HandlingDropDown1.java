package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown1 {
	public static void VerifyDropDown(WebElement drpDwn) {
		Select sel=new Select(drpDwn);
		boolean flag=sel.isMultiple();
		System.out.println(flag);
		if(flag) {
			System.out.println("Multi-select dropdown");
		}else {
			System.out.println("single-select dropdown");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
		WebElement drpDwn2=driver.findElement(By.name("Courses"));
		VerifyDropDown(drpDwn2);
		
		
		
		
		
		Select sel=new Select(drpDwn2);
		List<WebElement> options = sel.getOptions();
		int count=options.size();
		System.out.println("Total options: "+count);
		for (int i = 0; i <count; i++) {
			WebElement option=options.get(i);
			String optionText=option.getText();
			System.out.println(optionText);
		}
		
		
		
		
		//write a script to select and deselect all the options present inside the multi-select dropdown
		
		Select sel1=new Select(drpDwn2);
		List<WebElement> options1 = sel.getOptions();
		int count1=options1.size();
		System.out.println("Total options: "+count);
		for (int i = 0; i <count1; i++) {
			sel1.selectByIndex(i);
		}
		Thread.sleep(3000);
		for (int j = count1-1; j >=0; j--) {
			sel1.deselectByIndex(j);
			//sel1.deselectAll();
		}
	}

}
