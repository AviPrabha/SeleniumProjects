package package2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {
	public static <T> List<T> convert(Set<T> st){
		List<T> lt=new ArrayList<T>(st);
		return lt;
	}
	
	public static void main(String[] args) {
		
		Set<String> st=new HashSet<String>();
		st.add("ABC");
		st.add("PQR");
		st.add("XYZ");
		st.add("ABC");
		st.add("XYZ");
	System.out.println(st);
	System.out.println(st.size());
	
	List<String> myList=convert(st);
	System.out.println(myList);
	
	Set<Integer> st2=new HashSet<Integer>();
	st2.add(123);
	st2.add(456);
	st2.add(789);
	List<Integer> myList1=convert(st2);
	System.out.println(myList1);
	}
}
