package package1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	ExcelLib elib=new ExcelLib("./excel/readData.xlsx");
	Object[] data=elib.readData("createTask_ID","sheet1");
	System.out.println(data[1]);
	System.out.println(data[2]);
	System.out.println(data[3]);
	}
}
	
