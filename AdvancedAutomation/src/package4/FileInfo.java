package package4;

import java.io.File;


public class FileInfo {

	public static void main(String[] args) {
		File file= new File("./JSON/Persons.json");
		if (file.exists()) {
			System.out.println("File exist");
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			
		} else {
			System.out.println("File does not exist");

		}

	}

}
