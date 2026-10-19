package ArrayProg;

public class Test1 {
	//to print even index elements

	public static void main(String[] args) {
		int []s= {12,13,14,15,16,17,18,19,20};
		for(int i=0;i<s.length;i++) {
			if(i%2==0) {
				System.out.println(s[i]);
			}
			
		}
	}

}
