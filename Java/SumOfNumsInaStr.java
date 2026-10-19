package strings.Practice;

public class SumOfNumsInaStr {
	public static void main(String[] args) {
		String s = "Ayrak@232";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum += ch - '0';
			}
		}
		System.out.println(sum);
	}
}
