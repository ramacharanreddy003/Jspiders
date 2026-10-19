import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NumProgApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println(
					"1.Armstrong number\n2.Automorphic Number\n3.LCM\n4.GCD\n5.Palindrome\n6.Second Highest Prime\n"
							+ "7.Smallest Automorphic Number\n8.Strong Number\n9.Powerof a Number\n10.Neon number\n11.Tribonacci Series\n"
							+ "12.Fibonacci Series\n13.Exit\n" + "\nEnter a number: ");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				FileReader f1 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\Armstrong.java");
				int m1 = f1.read();
				while (m1 != -1) {
					System.out.print((char) m1);
					m1 = f1.read();
				}
				f1.close();
				break;

			case 2:
				FileReader f2 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\AutomorphicNum.java");
				int m2 = f2.read();
				while (m2 != -1) {
					System.out.print((char) m2);
					m2 = f2.read();
				}
				f2.close();
				break;

			case 3:
				FileReader f3 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\LCM.java");
				int m3 = f3.read();
				while (m3 != -1) {
					System.out.print((char) m3);
					m3 = f3.read();
				}

				f3.close();
				break;

			case 4:
				FileReader f4 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\GCD.java");
				int m4 = f4.read();
				while (m4 != -1) {
					System.out.print((char) m4);
					m4 = f4.read();
				}
				f4.close();
				break;

			case 5:
				FileReader f5 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\Palindrome.java");
				int m5 = f5.read();
				while (m5 != -1) {
					System.out.print((char) m5);
					m5 = f5.read();
				}
				f5.close();
				break;

			case 6:
				FileReader f6 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\SceondHighestPrime.java");
				int m6 = f6.read();
				while (m6 != -1) {
					System.out.print((char) m6);
					m6 = f6.read();
				}
				f6.close();
				break;

			case 7:
				FileReader f7 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\SmallestAutomorphic.java");
				int m7 = f7.read();
				while (m7 != -1) {
					System.out.print((char) m7);
					m7 = f7.read();

				}
				f7.close();
				break;

			case 8:
				FileReader f8 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\StrongNum.java");
				int m8 = f8.read();
				while (m8 != -1) {
					System.out.print((char) m8);
					m8 = f8.read();
				}
				f8.close();
				break;

			case 9:
				FileReader f9 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\PowerOfaNum.java");
				int m9 = f9.read();
				while (m9 != -1) {
					System.out.print((char) m9);
					m9 = f9.read();
				}
				f9.close();
				break;

			case 10:
				FileReader f10 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\NeonNumber.java");
				int m10 = f10.read();
				while (m10 != -1) {
					System.out.print((char) m10);
					m10 = f10.read();
				}
				f10.close();
				break;

			case 11:
				FileReader f11 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\TribonacciSeries.java");
				int m11 = f11.read();
				while (m11 != -1) {
					System.out.print((char) m11);
					m11 = f11.read();
				}
				f11.close();
				break;

			case 12:
				FileReader f12 = new FileReader(
						"C:\\Users\\ckram\\eclipse-workspace\\first\\src\\numprogramsApp\\numprog\\FibonacciSeries.java");
				int m12 = f12.read();
				while (m12 != -1) {
					System.out.print((char) m12);
					m12 = f12.read();
				}
				f12.close();
				break;

			case 13:
				b = false;
				System.out.println("Thank You :)");
				break;

			default:
				System.out.println("Invalid choice\n");
			}
		}

	}

}
