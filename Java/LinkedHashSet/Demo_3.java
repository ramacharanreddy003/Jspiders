package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo_3 {

	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<String>();
		s.add("Sumathi");
		s.add("Pavan");
		s.add("Lokesh");
		s.add("Lokesh");		// linkedhashset cannot allow duplicates
		s.add("lokesh");
		System.out.println(s);
	}

}
