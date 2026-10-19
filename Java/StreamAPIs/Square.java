package StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class Square {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		List<Integer> list=l.stream().map(i->i*i).toList();
		System.out.println(list);
	}
}
