package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintMobileNum {

	public static void main(String[] args) {
		String s = "ahydhbe6790341232bfhdh@.93412023939dkkm";
		String exp = "[6789][0-9]{9}";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		while (m.find())
			System.out.println(m.group());

	}

}
