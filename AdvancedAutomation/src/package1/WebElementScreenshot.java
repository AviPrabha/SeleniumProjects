package package1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementScreenshot {

	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",dir+"/exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //UPCASTING
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		
		WebElement tableEle=driver.findElement(By.id("loginBox"));
		File srcFile = tableEle.getScreenshotAs(OutputType.FILE);
		File destFile =new File(dir+"/screenshots/screenshot1.png");
		try {
			Files.copy(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		driver.close();
	}

}
