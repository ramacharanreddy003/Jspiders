package stringPrograms;

public class KeyOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javadev";
	
		char key='a';
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==key) {
				count++;
			}
			
		}
		System.out.println(key+"="+count);
	}

}
