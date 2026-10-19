package stringPrograms;

public class Prog {

	public static void main(String[] args) {
		String s="Hello World";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				continue;
			}
			char count='1';
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=count;
				}
			}
			if(count!='1') {
				ch[i]='1';
			}
		}
		System.out.println(ch);
	}

}
