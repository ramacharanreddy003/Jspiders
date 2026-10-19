package ArrayProg;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {5,4,7,0,3,2,1};
		System.out.println(Search(a,0));//returns index of 0
		System.out.println(Search(a,21));
	}
	public static int Search(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) return i;
		}
			return -1;
		
	}

}
