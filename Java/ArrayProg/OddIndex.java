package ArrayProg;

public class OddIndex {

	public static void main(String[] args) {
		int a[]= {11,12,13,14,15,16,17};
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				System.out.println(a[i]);
			}
		}

	}

}
