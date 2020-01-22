package package2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodTest {
	@BeforeMethod
	public void configBM(){
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void configAM() {
		System.out.println("After method");
	}
  @Test
  public void first() {
	  System.out.println("first-script");
  }
  @Test
  public void second() {
	  System.out.println("second-script");
  }
  
}
