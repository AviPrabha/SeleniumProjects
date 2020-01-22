package package2;

import java.time.LocalDate;

import net.bytebuddy.asm.Advice.Local;

public class JavaTime {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		
		//departure for current date
		int currentYear = ld.getYear();
		System.out.println(currentYear);
		
		int currentDate = ld.getDayOfMonth();
		System.out.println(currentDate);
		
		String currentMonthName = ld.getMonth().name();
		System.out.println(currentMonthName);
		
		currentMonthName=currentMonthName.substring(0, 1)+currentMonthName.substring(1).toLowerCase();
		System.out.println(currentMonthName);
		
		int currentMonthValue = ld.getMonthValue();
		System.out.println(currentMonthValue);
		
		
		//Return after 10 days
		LocalDate returnld=ld.plusDays(10);
		int returnDate = returnld.getDayOfMonth();
		System.out.println(returnDate);
		
		
		//return on 12th after 2 month
		LocalDate retld=ld.plusMonths(2);
		String returnMonthName = retld.getMonth().name();
		System.out.println(returnMonthName);
		
		returnMonthName=returnMonthName.subSequence(0, 1)+returnMonthName.substring(1).toLowerCase();
		System.out.println(returnMonthName);
		
		
		//return on next Year
		LocalDate ldnew=ld.plusYears(1);
		int returnYear = ldnew.getYear();
		System.out.println(returnYear);
		
		//Previous Date info
		LocalDate prevld=ld.minusYears(1);
		System.out.println(prevld);
	}

}
