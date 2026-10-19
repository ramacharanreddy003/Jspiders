package Programs;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1634;
		int m=n;
		int sum=0;
		int count=0;
		while(n>0) {
			n/=10;
			count++;
			
		}
		n=m;
		while(n>0) {
			int r=n%10;
			int pow=1;
			for(int i=1;i<=count;i++) pow*=r;
			sum+=pow;
			n/=10;
		}
		if(sum==m) {
			System.out.println(m+" is a Armstrong number");
		}else {
			System.out.println(m+" is not a Armstrong number");
		}
	}

}
