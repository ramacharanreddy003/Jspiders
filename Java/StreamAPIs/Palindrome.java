package StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		List<String> l = Arrays.asList("madam","malayalam");
		l.stream().filter(Palindrome::isPalindrome).forEach(i->System.out.print(i+", "));
	}

}
