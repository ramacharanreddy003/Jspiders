package StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class RemoveD {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(9,9,6,6,5,5,3,1,2,1);
		List<Integer> list=l.stream().distinct().sorted().toList();
		System.out.println(list);
	}
}
