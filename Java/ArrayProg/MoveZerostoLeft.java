package ArrayProg;

import java.util.Arrays;

public class MoveZerostoLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,0,2,0,0};
		int []b= new int[a.length];
		int j=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				 b[j--]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
