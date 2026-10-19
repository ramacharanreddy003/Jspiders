package StreamAPIs;

import java.util.function.Function;

public class SquareNum {
	public String Square(int n) {
		int res=n*n;
		String s= n+" square value is: "+res;
		return s;
	}
	public static void main(String[] args) {
		SquareNum s = new SquareNum();
		Function<Integer,Integer> f= i->i*i;
		System.out.println(f.apply(5));
		Function<Integer,String> f1=s::Square;
		System.out.println(f1.apply(5));
		System.out.println(f1.apply(4));
	}
}
