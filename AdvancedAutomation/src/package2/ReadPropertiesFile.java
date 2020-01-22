package package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
	File file=new File("./environment.properties");
	FileInputStream fis=new FileInputStream(file);
	Properties prop=new Properties();
	prop.load(fis);
	
	String value1=prop.getProperty("browserName");
	String value2=prop.getProperty("platfoemName");
	String value3=prop.getProperty("serverName");
	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);	
		
	}

}
