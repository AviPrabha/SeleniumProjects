package package2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConfigClass {
 
  @BeforeClass
  public void setUp() {
	  System.out.println("Before-Class");
  }

  @AfterClass
  public void tearDown() {
	  System.out.println("After-Class");
}
}