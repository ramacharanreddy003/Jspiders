package ExceptionHandlng;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}
	static void m1() {
		m2();
	}
	static void m2() {
		m3();
	}
	static void m3() {
		m4();
	}
	static void m4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quotient ");
		int quotient=sc.nextInt();
		System.out.println("Enter divisior ");
		int divisior=sc.nextInt();
		
		int res=quotient/divisior;
		System.out.println(res);
	
	}
}
