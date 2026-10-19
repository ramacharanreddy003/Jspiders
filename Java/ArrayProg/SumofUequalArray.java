package ArrayProg;

import java.util.Arrays;

public class SumofUequalArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3};
		int l=a.length<b.length?a.length:b.length;
		for(int i=0;i<l;i++) {
			if(b.length>a.length) {
				b[i]+=a[i];
			}else {
				a[i]+=b[i];
			}
		}
			b=b.length>a.length?b:a;
			System.out.println(Arrays.toString(b));
			
	}
}
