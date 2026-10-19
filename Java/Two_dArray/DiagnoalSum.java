package Two_dArray;

public class DiagnoalSum {

	public static void main(String[] args) {
		int a[][]= {
				{2,3,4},
				{5,6,7},
				{8,9,10}};
		int sum=0;
		for(int i=0;i<a.length;i++) {
				sum+=a[i][i];
			}
				System.out.println(sum);

	}

}
