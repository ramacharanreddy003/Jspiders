package MuliDimensionalArray;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[5];
		arr[2] = new int[4];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[1][2] = 33;
		arr[1][3] = 23;
		arr[1][4] = 87;
		
		arr[2][0] = 8;
		arr[2][1] = 1;
		arr[2][2] = 9;
		arr[2][3] = 12;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
