package ArrayProg;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] a= {10,20,30,45,56};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[1]);
		}
		System.out.println("==========");
		for(int n:a)
			System.out.println(n+" ");
		System.out.println();
		System.out.println("======");
		System.out.println(Arrays.toString(a));
		
		//System.out.println(a);
	}

}
