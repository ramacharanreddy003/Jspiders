package palindrome_;

public class StrongNum {

	public static void main(String[] args) {
		
		int n=145;
		int sum=0;
		int m=n;
		while(n>0) {
			int r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++) fact*=i;
			sum+=fact;
			n/=10;
		}
			if(sum==m) {
				System.out.println(m+" is a Strong number");
			}else {
				System.out.println(m+" is not a Strong number");
			}
		}
		
	}
	