package paternsTUF;

public class P5 {

	public static void P5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		P5(5);
	}
}
