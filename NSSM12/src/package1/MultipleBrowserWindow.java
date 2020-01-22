package package1;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("http://desktop-v3tcd3d/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//span[text()='Help & Support']")).click();
		String xp="//div[contains(text(),'User Guide')]";
		driver.findElement(By.xpath(xp)).click();
		
		Set<String> sessions = driver.getWindowHandles();
		System.out.println(sessions);
		System.out.println(sessions.size());
		
		 Iterator<String> itr = sessions.iterator();
		 String parentID=itr.next();
		 System.out.println(parentID);
		 
		 String childID=itr.next();
		 System.out.println(childID);
		 
		 driver.switchTo().window(childID);
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.linkText("Reporting Overview")).click();
		 
		 Thread.sleep(1000);
		 
		 //driver.close();
		 driver.switchTo().window(parentID);
		 driver.findElement(By.id("logoutLink")).click();
		 driver.close();
		 driver.quit();
	}

}
