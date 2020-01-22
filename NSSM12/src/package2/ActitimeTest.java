package package2;

import org.testng.annotations.Test;

public class ActitimeTest {
  @Test
  public void createNewCustomer() {
	  System.out.println("Customer created");
  }
  
  @Test(dependsOnMethods={"createNewCustomer"})
  public void createNewProject() {
	System.out.println("Project created");
}
}
