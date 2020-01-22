package package1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCompleteWebOrders {
	public static void main(String[] args) {
		WebDriver driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
			
		String headerXp = "//div[@class='content']//tr/th";
		List<WebElement> headers = driver.findElements(By.xpath(headerXp));
		int headersCount=headers.size();
		for (int k = 2; k <= headersCount-1 ; k++) {
			String headerDataXp = "//div[@class='content']//tr/th["+k+"]";
			String value1=driver.findElement(By.xpath(headerDataXp)).getText();
			System.out.println(value1);
		}
		
		 String rowsXp = "//div[@class='content']//tr";
		 List<WebElement> rows = driver.findElements(By.xpath(rowsXp));
		 int rowCount = rows.size(); 
		
		 for (int i = 1; i <=rowCount; i++) {
				String colXp = "//div[@class='content']//tr["+i+"]/td";
				List<WebElement> cols = driver.findElements(By.xpath(colXp));
				int colCount = cols.size();
				
     	 for(int j=2;j<=colCount-1;j++) {
				String dataXp="//div[@class='content']//tr["+i+"]/td["+j+"]";
				String value = driver.findElement(By.xpath(dataXp)).getText();
				System.out.println(value);
             }	
       }  
  }
}