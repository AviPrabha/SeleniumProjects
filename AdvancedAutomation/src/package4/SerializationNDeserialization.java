package package4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationNDeserialization {

	public static void main(String[] args) {
		//Serialization converting java object into byte stream
		Employee emp1= new Employee(20, "TY_123", "Guldu");
		Employee emp2= new Employee();
		emp2.setAge(25);
		emp2.setEmployeeID("Qsp_123");
		emp2.setFirstName("Narendra");
		
		File file= new File("Employee.txt");
		
		try {
			FileOutputStream fos= new FileOutputStream(file);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			System.out.println("Serialization "+emp1.toString());
			System.out.println("Serialization "+emp2.toString());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
	//deserialization converting byte stream into java object
	
	try
	{
		FileInputStream fis= new FileInputStream(file);
		ObjectInputStream ois= new ObjectInputStream(fis);
		Employee obj= (Employee)ois.readObject();
		System.out.println(obj.getAge());
		System.out.println(obj.getEmployeeID());
		System.out.println(obj.getFirstName());
		ois.close();
		System.out.println("Deserialization...");
	}
	
	catch(IOException | ClassNotFoundException e)
	{
		
	}
  }
}


