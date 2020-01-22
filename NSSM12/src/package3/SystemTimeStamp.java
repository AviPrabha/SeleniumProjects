package package3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemTimeStamp {

	public static void main(String[] args) {
	Date date=new Date();
	System.out.println(date);
	SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	String timeStamp = sdf.format(date);
		System.out.println(timeStamp);
	}

}
