package stringspractice;

public class CharsCount {

	public static void main(String[] args) {
		String s="@123#AbcdE";
		int lowercount=0 ,uppercount=0,specialcount=0,numcount=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				 uppercount++;
			}else if(ch>='a' && ch<='z') {
				lowercount++;
			}else if(ch>='0' && ch<='9') {
				numcount++;
			}else {
				specialcount++;
			}
		}
		System.out.println("Upper count: "+uppercount);
		System.out.println("Lower count: "+lowercount);
		System.out.println("Special count: "+ specialcount);
		System.out.println("Number count: "+numcount);
	}

}
