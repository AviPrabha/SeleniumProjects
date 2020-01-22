package package2;

import java.text.MessageFormat;
import java.util.Random;

public class Concatenation {

	public static void main(String[] args) {
		String pattern="My friend {0} is going to buy iPhone X pro having price {1} rupees and he has {2} rupees.";
		Object[] obj= {"Kundan",100000,"2 Lakh"};
		String value=MessageFormat.format(pattern, obj);
		System.out.println(value);
		
		Random rdm=new Random();
		int number=rdm.nextInt(1000);
		Object[] num= {number};
		String xp="//a[text()='GE HealthCare '{0}'']";
		String dynamicXp = MessageFormat.format(xp, num);
		System.out.println(dynamicXp);
	}
}
