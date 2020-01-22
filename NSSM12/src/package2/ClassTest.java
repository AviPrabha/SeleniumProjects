package package2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ClassTest {
 
  @BeforeClass
  public void configBC() {
	  System.out.println("Before-Class");
  }

  @AfterClass
  public void configAC() {
	  System.out.println("After-Class");
  }
  
  @Test
  public void first() {
	  System.err.println("First-Script");
  }
  @Test
  public void second() {
	  System.err.println("Second-Script");
  }
  
}
