package com.odoo.scripts;
import org.testng.annotations.Test;
import com.odoo.generic.ExcelUtilities;
import com.odoo.generic.GenericLib;

public class LoginTest extends BaseAbstractTest 
{		
	@Test
	  public void validLogin() {
		ExcelUtilities eu=new ExcelUtilities(GenericLib.dir+"/testdata/odootestdata.xlsx");
		String[] data =eu.readData("validLogin_ID", "Sheet1");
		lf.validLogin(data[1],data[2] );
		
		ohf.verifyOdooHomePage(data[1]);
	}
}