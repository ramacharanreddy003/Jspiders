package Programs;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=12;
		int min=a<b?a:b;
		int gcd=1;
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
				
			}
		}
			System.out.println(gcd);
	}

}
