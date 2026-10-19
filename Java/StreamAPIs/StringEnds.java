package StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class StringEnds {
	public static void main(String[] args) {
		List<String> s=Arrays.asList("Ramu","Siva","Geeta","Pavan");
		long a = s.stream().filter(i->i.endsWith("a")).count();
		System.out.println(a);
		
	}
}
