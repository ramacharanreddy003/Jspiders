package ArrayProg;

public class MaxElement {

	public static void main(String[] args) {
		int a[]= {10,11,12,13};
		System.out.println(max(a));
		System.out.println(min(a));
		System.out.println(SecondMax(a));
		System.out.println(Secondmin(a));
	}
	
	public static int max(int []a) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	
	public static int min(int[] a) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	
	public static int SecondMax(int[] a) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]==max1) continue;
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
				
			}else if(a[i]>max2)
				max2=a[i];
		}
			return max2;
		
	}
	
	public static int Secondmin(int[] a) {
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
//			if(a[i]<min1) continue;
			if(a[i]<min1) {
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2 && a[i]!=min1)
				min2=a[i];
			
		}
		return min2;
	}
	
}
