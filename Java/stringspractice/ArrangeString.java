package stringspractice;

public class ArrangeString {

	public static void main(String[] args) {
		String s="@123#AbcdE";
		
		String sp="",nc="",cc="",sc="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				cc+=ch;
			}else if(ch>='a' && ch<='z') {
				sc+=ch;
			}else if(ch>='0' && ch<='9') {
				nc+=ch;
			}else {
				sp+=ch;
			}
		}
		String result=cc+sc+nc+sp;
		System.out.println(result);
	}

}
