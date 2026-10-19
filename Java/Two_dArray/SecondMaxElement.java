package Two_dArray;

public class SecondMaxElement {
	
	public static void main(String[] args) {
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {	
				if(a[i][j]==max1) continue;
				if(a[i][j]>max2 && a[i][j] != max1)
					max2=max1;
				max1=a[i][j];
				 if(a[i][j]>max2)
					max2=a[i][j];
			}
		}
			System.out.println(max2);
		
	}

}
