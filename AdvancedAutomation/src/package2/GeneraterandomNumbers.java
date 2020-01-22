package package2;

import java.util.Random;

public class GeneraterandomNumbers {

	public static void main(String[] args) {
		Random rdm=new Random();
		int number = rdm.nextInt();
		System.out.println(number);
	}

}
