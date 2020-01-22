package package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExistingWorkbook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File file=new File("./excel/Report.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.createSheet("Manual Report");
	Row rw = sh.createRow(0);
	Cell cl = rw.createCell(1);
	cl.setCellValue("TestCase ID");
	
	FileOutputStream fos=new FileOutputStream(file);
	wb.write(fos);
	
	System.out.println("Data Successfully Written");
		
	}

}
