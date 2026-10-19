package ArrayProg;

public class EncryptDecrypt {

	public static void main(String[] args) {
		String s="ctg aqw htgg vqfca";
		System.out.println(Encode("abc",2));
		System.out.println(Decode(s,2));
		
	}
	
	public static String Encode(String s,int n) {
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(ch[i]))
				ch[i]=(char)((((((ch[i]+n)-'a')%26)+26)%26)+'a');
			else if(Character.isUpperCase(ch[i]))
				ch[i]=(char)((((((ch[i]+n)-'A')%26)+26)%26)+'A');
		}
		return new String(ch);
		}
	public static String Decode(String s,int n) {
		return Encode(s,-n);
	}

}
