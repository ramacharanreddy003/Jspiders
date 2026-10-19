package stringPrograms;

public class Sumofnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ram12@32#k";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				sum+=ch-'0';
			}
		}
			System.out.println(sum);
		
	}

}
