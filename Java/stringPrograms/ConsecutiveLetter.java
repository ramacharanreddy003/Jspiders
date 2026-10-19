package stringPrograms;

public class ConsecutiveLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace("BOSS"));
		System.out.println(replace("BOSSSS"));
		
		

	}
	public static String replace(String s) {
			char ch[] = s.toCharArray();
			for(int i=1;i<s.length();i++) {
				if(ch[i]==ch[i-1]) {
					ch[i]='$';
				}
			}
			return new String(ch);
			
	}

}
