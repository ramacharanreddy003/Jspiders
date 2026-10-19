package stringspractice;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 1 }, { 3, 2, 4 }, { 3, 3, 2 } };
		int[][] b = { { 2, 2, 1 }, { 1, 1, 2 }, { 2, 1, 2 } };
		int c[][] = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					c[i][j] += a[i][k] * b[k][j];

				}
			}

		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
