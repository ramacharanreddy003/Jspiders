package stringPrograms;

public class Test2 {

	public static void main(String[] args) {
		String s="JavA";
		char [] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a' && c<='z')
				ch[i]-=32;
			if(c>='A' && c<='Z')
				ch[i]+=32;
		}
		System.out.println(ch);
	}

}
