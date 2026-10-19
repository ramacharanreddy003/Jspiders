package StreamAPIs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Contains {
	public static void main(String[] args) {
		List<String> s=Arrays.asList("Ram","Sita","Ravan","yudeesh");
		List<String> list=s.stream().filter(i->i.contains("a")).toList();
		System.out.println(list);
	}

}
