package paternsTUF;

public class P14 {

	public static void main(String[] args) {
		P14(5);

	}

	public static void P14(int n) {
		for (int i = 0; i < n; i++) {
			for (char ch = 'A'; ch <= 'A' +i; ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}	
	}

}
