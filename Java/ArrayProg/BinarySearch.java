package ArrayProg;

public class BinarySearch {

	public static void main(String[] args) {
			int []a= {2,4,6,8,10};
			System.out.println(Search(a,10));
	}
	
	public static int Search(int [] a,int key) {
		int st=0;
		int end=a.length-1;
		while(st<=end) {
			int mid=(st+end)/2;
			if(key==a[mid])
				return mid;
			else if(key<a[mid])
				key=mid+1;
			else
				st=mid+1;		
					
		}
		return -1;
	}
}
