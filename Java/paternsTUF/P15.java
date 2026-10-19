package paternsTUF;

public class P15 {

	public static void main(String[] args) {
		P15(5);

	}

	public static void P15(int n) {
		for (int i = 0; i < n; i++) {
			for (char ch = 'A'; ch <= 'A'-i+n-1; ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}	
	}

}
