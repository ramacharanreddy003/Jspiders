package SortingProg;

import java.util.Arrays;

public class BubbleSortDes {

	public static void main(String[] args) {
		int a[]= {2,5,23,56,2,3,9};
		Sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void Sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
	}

}
