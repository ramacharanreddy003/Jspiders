package stringPrograms;

public class ArrangString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="@123#AbcdE";
		String lc="",uc="",nc="",sp="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
				lc+=ch;
			else if(ch >='A' && ch<='Z')
				uc+=ch;
			else if(ch>='0' && ch<='9')
				nc+=ch;
			else
				sp+=ch;
		}
		String  res=uc+lc+nc+sp;
		System.out.println(res);
	}
	
}
