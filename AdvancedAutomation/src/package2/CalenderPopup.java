package package2;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import package1.BrowserFactory;

public class CalenderPopup {

	public static void main(String[] args) {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	    LocalDate ld=LocalDate.now();
	    String currentMonth = ld.getMonth().name();
	    String currentMonthName = currentMonth.substring(0, 1)+currentMonth.substring(1).toLowerCase();
	    int currentMonthIndex = ld.getMonthValue();
	    int currentDate=ld.getDayOfMonth();
		String xp="//div[starts-with(text(),'"+currentMonthName+"')]/parent::div//following-sibling::div//p[text()='"+currentDate+"']";
		driver.findElement(By.xpath(xp)).click();
		driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		LocalDate ldnew=ld.plusMonths(2);
		String returnMonth=ldnew.getMonth().name();
		int returnMonthIndex=ldnew.getMonthValue();
		String returnMonthName=returnMonth.substring(0, 1)+returnMonth.substring(1).toLowerCase();
		int returnDate = ld.plusDays(10).getDayOfMonth();
		for (int i = currentMonthIndex; i < returnMonthIndex; i++) {
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();	
		}
		String xp2="//div[starts-with(text(),'"+returnMonthName+"')]/parent::div//following-sibling::div//p[text()='"+returnDate+"']";
		driver.findElement(By.xpath(xp2)).click();
	}

}
