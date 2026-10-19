package ExceptionHandlng;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter quotient");
		int quotient=sc.nextInt();
		System.out.println("Enter divisior");
		int divisior=sc.nextInt();
		int res=quotient/divisior;
		System.out.println("res="+ res);

	}

}
