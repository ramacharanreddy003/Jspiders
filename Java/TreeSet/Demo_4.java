package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Demo_4 {
	public static void main(String[] args) {
		Set <Integer> s = new TreeSet<Integer>();
		s.add(12);
		s.add(34);
		s.add(65);
		//s.add(null);
		s.add(12);
		
		System.out.println(s);
	}
}
