package HashSet;

import java.util.HashSet;
import java.util.Set;

public class test4 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Amar");
		s.add("Ram");
		s.add("Charan");
		s.add(null);
		for(String str:s)
			System.out.println(str);
			
	}

}
