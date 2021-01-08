package package4;

import java.io.File;
import java.io.IOException;

public class CreateDirAndFile {

	public static void main(String[] args) throws IOException {
		File file= new File("JSON");
		boolean flag = file.mkdir();
		System.out.println(flag);
		if (flag) {
			System.out.println("JSON folder created");
			File freshFile= new File("./JSON/Persons.json");
			boolean flag2 = freshFile.createNewFile();
			System.out.println(flag2);
			if (flag2) {
				System.out.println("Fresh file created");
			} else {
				System.out.println("File already exist");
			}
		} else {
			System.out.println("JSON folder already exist");
		}
	}
}
