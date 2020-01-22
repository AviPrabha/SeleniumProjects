package package2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import package1.BrowserFactory;

public class FileUploadPopup {

	public static void main(String[] args) throws IOException {
		WebDriver driver=BrowserFactory.launchBrowser("firefox");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://file.fm/");
		
		String xp="//input[@id='file_upload']/following-sibling::input";
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].click()", driver.findElement(By.xpath(xp)));
		String className=driver.getClass().getSimpleName();
		if (className.equalsIgnoreCase("chromedriver")) {
			Runtime.getRuntime().exec("C:/Users/AviPrabha/Desktop/FileUpload.exe");
			System.out.println("Chrome upload");
		}
		else if (className.equalsIgnoreCase("firefoxdriver")) {
			Runtime.getRuntime().exec("C:/Users/AviPrabha/Desktop/FirefoxFileUpload.exe");
			System.out.println("Firefox upload");
		}
	}
}
