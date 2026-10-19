package StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class ToLowercase {
	public static void main(String[] args) {
		List<String> s = Arrays.asList("Ram","Sita","Laxman");
		List<String> list=s.stream().map(i->contains("a").map(i->toUpperCase().foreach(i->System.out.println(i+" "))));
}
}
