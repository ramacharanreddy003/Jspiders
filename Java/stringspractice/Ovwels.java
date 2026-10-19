package stringspractice;

public class Ovwels {
	public static void main(String[] args) {
		String s="java is a programming language";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
			System.out.println(count);
	}

}
