package package3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
	File file=new File("./excel/Report.xlsx");
	Workbook wb=new XSSFWorkbook();
	Sheet sh = wb.createSheet("Automation Report");
	
	Row rw = sh.createRow(2);
	Cell cl = rw.createCell(0);
	cl.setCellValue("Selenium Execution report");
	
	Cell cl2 = rw.createCell(1);
	cl2.setCellValue("Appium Execution Report");
	
	FileOutputStream fos=new FileOutputStream(file);
	wb.write(fos);
	
	System.out.println("Data Successfully Written");
		
	}

}
