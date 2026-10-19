package stringPrograms;

public class MissingOvwels {

	public static void main(String[] args) {
		String s="India";
		String vowel="aeiouAEIOU";
		for(int i=0;i<vowel.length();i++) {
			boolean found=false;
			for(int j=0;j<s.length();j++) {
				if(vowel.charAt(i)==s.charAt(j)) {
					found=true;
					break;
				}
			}
			if(!found) {
				System.out.print(vowel.charAt(i)+" ");
			}
		}
		
	}

}
