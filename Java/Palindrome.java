package strings.Practice;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("nano"));
	}
	
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}
}

