package stringPrograms;

public class NoofWords {

	public static void main(String[] args) {
		String s="java is easy language";
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("No of words: "+count);
	}

}
