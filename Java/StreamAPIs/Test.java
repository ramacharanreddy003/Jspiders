package StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> list=l.stream().filter(i->i%2==0).toList();
		System.out.println(list);

	}

}
