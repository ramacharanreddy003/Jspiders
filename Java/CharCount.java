package strings.Practice;

import java.util.Iterator;

public class CharCount {

	public static void main(String[] args) {
		String s="#22@mfkS.";
		int lc=0,uc=0,sc=0,nc=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				lc++;
			}else if(ch>='A' && ch<='Z') {
				uc++;
			}else if(ch>='0' && ch<='9') {
				nc++;
			}else {
				sc++;
			}
		}
		System.out.println("UC: "+uc);
		System.out.println("LC: "+lc);
		System.out.println("SC: "+sc);
		System.out.println("NC: "+nc);
	}
}
