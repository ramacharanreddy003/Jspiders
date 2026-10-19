package numPrograms App;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NumProgApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println("1.Armstrong number\n2.Automorphic Number\n3.LCM"+"\nEnter a number: ");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				FileReader f1 = new FileReader("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Programs\\Armstrong.java");
				int m1 = f1.read();
				while (m1 != -1) {
					System.out.print((char) m1);
					m1 = f.read();
				}
				f1.close();
				break;

			case 2:
				FileReader f2 = new FileReader("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Programs\\AutomorphicNum.java");
				int m2 = f2.read();
				while (m2 != -1) {
					System.out.print((char) m2);
					m2 = f2.read();
				}
				f2.close();
				break;
				
			case 3:
				FileReader f3= new FileReader("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Programs\\LCM.java");
				int m3=f3.read();
				while(m3!=-1) {
					System.out.print((char)m3);
					m3=f3.read();
				}
			
				f3.close();
				break;
				
			case 4:
				FileReader f4 = new FileReader("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numPrograms App\\numprog\\GCD.java");
				int m4=f4.read();
				while(m4!=-1) {
					System.out.println((char)m4);
					m4=f4.read();
				}
				f4.close();
				break;
				
			}
		}

	}

}
