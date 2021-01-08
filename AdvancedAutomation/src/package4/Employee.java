package package4;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID=1L;
	int age;
	String employeeID;
	String firstName;
	
	public Employee()
	{
		
	}

	public Employee(int age, String employeeID, String firstName) {
		this.age = age;
		this.employeeID = employeeID;
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		
		return "Age: "+getAge()+", "+"EmployeeID: "+getEmployeeID()+", "+"FirstName"+getFirstName();
	}
	
	
	
	

}
