package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingWebTable {

	public static void main(String[] args) {
	WebDriver driver=BrowserFactory.launchBrowser("chrome");
	driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
	
	 String rowsXp = "//table[@name='Num']//tr";
	 List<WebElement> rows = driver.findElements(By.xpath(rowsXp));
	 int rowCount = rows.size();
	 System.out.println("Total Rows: "+rowCount);
	 
	 
	 
	 //write a script to find no of columns present inside each row.
	 int sum=0;
	 for (int i = 1; i <=rowCount; i++) {
		String colXp = "//table[@name='Num']//tr["+i+"]/td";
		List<WebElement> cols = driver.findElements(By.xpath(colXp));
		int colCount = cols.size();
		System.out.println("Row: " +i + " Total columns: "+colCount);

		
	  //write a script to print all the data from each row and each column.
		
	for(int j=1;j<=colCount;j++) {
		String dataXp="//table[@name='Num']//tr["+i+"]/td["+j+"]";
		String value = driver.findElement(By.xpath(dataXp)).getText();
		System.out.println(value);
		
		sum=sum+Integer.parseInt(value);
		
	}
}
	 System.out.println("Total Sum: "+sum);
	 
	 
	 
	 
	 
	  //write a script to print all the data from each row and each column.
	}
}