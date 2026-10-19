package Programs;
public class AutomorphicNum {
	public static void main(String[] args) {
		
		int n=5;
		int m=n;
		int sq=n*n;
		boolean flag=true;
		while(m>0) {
			if(m%10!=sq%10) {
				flag=false;
				break;
			}
			m/=10;
			sq/=10;
		}
		if(flag) {
			System.out.println(n+" is Automorphic number");
		}else {
			System.out.println(n+" is not Automorphic number");
		}
	}

}
