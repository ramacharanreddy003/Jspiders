package StreamAPIs;

import java.util.Arrays;

public class RemoveDup {
	public static void main(String[] args) {
		//String s="java is very very easy java";
		Arrays.asList("java is very very easy".split(" ")).stream().distinct().forEach(i->System.out.print(i+" "));
	}
}
