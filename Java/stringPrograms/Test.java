package stringPrograms;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		char[] ch=s.toCharArray();
		ch[0]='J';
		System.out.println(s);
		System.out.println(ch);
		ch[2]='V';
		System.out.println(ch);
		
		String s1=s.toLowerCase();
		System.out.println(s1);
		String s2=s.toUpperCase();
		System.out.println(s2);
		
	}

}
