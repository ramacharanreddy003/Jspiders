package Programs;

public class SceondHighestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primecount=0;
		for(int j=20;j>=1;j--) {
			int n=j;
			boolean flag=true;
			if(n<=1) flag=false;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				primecount++;
				if(primecount==2) {
					System.out.println(j);
				}
			}
		}
	}

}
