package Two_dArray;

public class JaggedArray {

	public static void main(String[] args) {
	int [][]a= {{1,2,3,4},{7,8,9},{77,88}};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
	}

}
