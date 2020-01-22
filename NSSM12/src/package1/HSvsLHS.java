package package1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HSvsLHS {

	public static void main(String[] args) {
	Set<String> hs = new HashSet<String>();
	hs.add("ABC");
	hs.add("XYZ");
	hs.add("AAA");
	System.out.println(hs);
	System.out.println(hs.size());
	
	for (String value : hs) {
		System.out.println(value);
	}
	
	
	
	Set<String> lhs=new LinkedHashSet<String>();
	lhs.add("ABC");
	lhs.add("XYZ");
	lhs.add("AAA");
	System.out.println(lhs);
	System.out.println(lhs.size());
	Iterator<String> itr=lhs.iterator();
	
	while (itr.hasNext()) {
		String value = itr.next();
		System.out.println(value);
	}
  }
}
