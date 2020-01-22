package package2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class GroupExecutionTest {
 
  @BeforeClass(groups= {"Regression"})
  public void setUp() {
	  System.out.println("Before Class");
  }

  @BeforeMethod(groups= {"Smoke","Sanity"})
  public void preCondition() {
	  System.out.println("Before Method");
  }
  
  @Test(groups= {"Smoke","Sanity"})
  public void validLogin() {
	  System.out.println("valid Login");
  }
  
  @Test(groups= {"Smoke","Regression"})
  public void createCustomer() {
	  System.out.println("Create Customer");
  }
  
  @Test(groups= {"Regression"})
  public void createProject() {
	  System.out.println("Create Project");
  }
}
