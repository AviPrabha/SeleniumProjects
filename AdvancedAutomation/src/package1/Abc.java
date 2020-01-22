package package1;

public class Abc {
	private class B{
		void msg() {
			System.out.println("hiiiii");
		}
	}

	public static void main(String[] args) {
		Abc.B b=new Abc().new B();
		b.msg();
		
		
	}

}
 