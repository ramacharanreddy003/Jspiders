package stringspractice;

public class Pract {
	public static void main(String[] args) {
//		String s="Ram Charan";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev+=s.charAt(i);
//		}
//		System.out.println(rev);

//		String s = "Ram";
//		char key = 'a';
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (ch == key)
//				count++;
//		}
//		System.out.println(key+"="+count);

//		String s="Ram Charan Reddy";
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
//					|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
//				count++;
//			}
//		}
//		System.out.println("Vowel count: "+count);

//		String s = "@123#AbcdE";
//		int lc = 0, up = 0, sc = 0, nc = 0;
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (ch >= 'a' && ch <= 'z') {
//				lc++;
//			} else if (ch >= 'A' && ch <= 'Z') {
//				up++;
//			} else if (ch >= '0' && ch <= '9') {
//				nc++;
//			} else {
//				sc++;
//			}
//		}
//		System.out.println("Lower count: " + lc);
//		System.out.println("Upper count: " + up);
//		System.out.println("Special conut: " + sc);
//		System.out.println("Number count: " + nc);
		
		String s="@123#AbcdE";
		String lc="",uc="",sc="",num="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&& ch<='Z') {
				uc+=ch;
			}else if(ch>='a' && ch<='z') {
				lc+=ch;
			}else if(ch>='0' && ch<='9') {
				num+=ch;
			}else {
				sc+=ch;
			}
		}
		String res=uc+lc+num+sc;
		System.out.println(res);
		
		
		
	}
}
