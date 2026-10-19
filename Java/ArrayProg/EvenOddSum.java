package ArrayProg;

public class EvenOddSum {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int esum=0;
		int osum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				esum+=a[i];
			else
				osum+=a[i];
		}
			System.out.println(esum);
			System.out.println(osum);
		

	}

}
