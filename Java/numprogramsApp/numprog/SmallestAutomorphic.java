package Programs;

public class SmallestAutomorphic {

	public static void main(String[] args) {
		
		for(int j=1;j<=100;j++) {
			int n=j;
			int m=n;
			int sq=n*n;
			boolean flag=true;
			while(n>0) {
				if(n%10!=sq%10) {
					flag=false;
					break;
				}
				n/=10;
				sq/=10;
			}
			if(flag) {
				System.out.println(m+" is a smallest Automorphic number");
				break;
			}
		}
	}

}
