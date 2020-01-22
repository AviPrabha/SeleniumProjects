package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkingWithWebElement {

	public static void main(String[] args) {
	WebDriver driver=BrowserFactory.launchBrowser("chrome");
	driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
	WebElement unTxtBx=driver.findElement(By.id("user"));
	unTxtBx.sendKeys("abcd");
	unTxtBx.clear();
	unTxtBx.sendKeys("xyz");
	
	unTxtBx.sendKeys(Keys.CONTROL+"a");
	unTxtBx.sendKeys(Keys.DELETE);
	unTxtBx.sendKeys("admin");
	
	String headerText = driver.findElement(By.tagName("h1")).getText();
	System.out.println(headerText);
	String linkText = driver.findElement(By.tagName("a")).getText();
	System.out.println(linkText);
	
	
	WebElement pwdTxtBx=driver.findElement(By.name("pwd"));
	String value=pwdTxtBx.getAttribute("placeholder");
	System.out.println(value);
	
	pwdTxtBx.sendKeys("1234");
	String value2=pwdTxtBx.getAttribute("value");
	System.out.println(value2);
	
	String css1=driver.findElement(By.tagName("h1")).getCssValue("font-size");
	System.out.println(css1);
	
	String css2=driver.findElement(By.tagName("a")).getCssValue("font-size");
	System.out.println(css2);
	
	Dimension dim=driver.findElement(By.tagName("img")).getSize();
	int height=dim.getHeight();
	int width=dim.getWidth();
	System.out.println("Height is: "+height);
	System.out.println("Width is: "+width);
	
	int pageHeight=driver.findElement(By.tagName("body")).getSize().getHeight();
	System.out.println("Total page Height: "+pageHeight);
	
	
	try {
		driver.findElement(By.tagName("spam"));
		System.out.println("Element exist in html doc");
	}
	catch(NoSuchElementException e) {
		System.out.println("Element does not exist in html doc");
	}
	
	WebElement chkBx=driver.findElement(By.className("MyCheckBox"));
	boolean flag=chkBx.isSelected();
	System.out.println(flag);
	if(flag) {
		System.out.println("Already selected");
	}else {
		chkBx.click();
	}
	}

}
