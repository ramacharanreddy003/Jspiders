package ArrayProg;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,7};
		System.out.println(Search(a,6,0,a.length-1));
		
	}
	public static int Search(int[] a,int key,int st,int end) {
		if(st>end)
			return -1;
		int mid=(st+end)/2;
		if(key==a[mid])
			return mid;
			else if(key<a[mid])
				return Search(a,key,st,mid-1);
			else
				return Search(a,key,mid+1,end);
		
	}

}
