package stringspractice;

public class Practice {
//	public static void main(String[] args) {
//		String s = "java programming";
//		System.out.println(rev(s));
	// }
//
//	public static String rev(String s) {
//		int i = 0;
//		int j = 0;
//		String res = "";
//		while (j < s.length()) {
//			while (j < s.length() && s.charAt(j) != ' ')
//				j++;
//			int k = j - 1;
//			while (k >= i)
//				res += s.charAt(k--);
//			if (j < s.length())
//				res += " ";
//			j++;
//			i = j;
//
//		}
//		return res;

//	public static void main(String[] args) {
//		System.out.println(isPalindrome("madam"));
//		System.out.println(isPalindrome("cat"));
//		System.out.println(isPalindrome("racecar"));
//	}

	//public static boolean isPalindrome(String s) {
	//	int i = 0;
	//	int j = s.length() - 1;
	//	while (i < j) {
	//		if (s.charAt(i) != s.charAt(j))
	//			return false;
		//	i++;
		//	j--;
	//	}
		//return true;

	//}
	
	public static void main(String[] args) {
		String s="java is a progrsmming language";
		System.out.println(rev(s));
	}
	public static String rev(String s) {
		int i=0;
		int j=0;
		String res="";
		while(j<s.length()) {
			while(j<s.length() && s.charAt(j)!=' ')
				j++;
			int k=j-1;
			while(k>=i)
				res+=s.charAt(k--);
			if(j<s.length())
				res+=" ";
			j++;
			i=j;
		}
	return res;	
	}
	
	
	
	
}
