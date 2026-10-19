package SortingProg;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {2,5,62,7,3,7,7};
		Sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void Sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int minindex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minindex])
					minindex=j;
			}
			int temp=a[i];
			a[i]=a[minindex];	
			a[minindex]=temp;
		}
	}

}
