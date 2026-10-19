package palindrome_;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=121;
	int m=n;
	int rev=0;
	while(n>0) {
		int r=n%10;
		rev=(rev*10)+r;
		n/=10;
	}
	if(rev==m) {
		System.out.println(m+" is a Palindrome");
	}else {
		System.out.println(m+" is not a Palindrome");
	}
	
	
	}

}
