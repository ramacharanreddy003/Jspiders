package stringspractice;

public class SumOfNumsInStr {

	public static void main(String[] args) {
		String s = "Ram12@32#k";
		int sum = 0, num = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9') {
				num = num * 10 + (ch - '0');
			}else {
				sum += num;
				num = 0;
					
			}
		}
		
		//sum += num;
		System.out.println(sum);
	}

}
