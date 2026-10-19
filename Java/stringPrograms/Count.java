package stringPrograms;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="@123#AbcdE";
		int lc=0,uc=0,nc=0,sp=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
				lc++;
			else if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='0' && ch<='9')
				nc++;
			else
				sp++;
			
		}
		System.out.println("upper count: "+uc);
		System.out.println("lower count: "+lc);
		System.out.println("number count: "+nc);
		System.out.println("special count: "+sp);
		
		
	}

}
