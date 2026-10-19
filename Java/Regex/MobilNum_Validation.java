package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobilNum_Validation {

	public static void main(String[] args) {
		String s = "9830423294";
		
		String exp = "[6789][0-9]{9}";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		if(m.matches())
			System.out.println("Valid mobile number");
		else
			System.out.println("Invalid mobile number");
		}
	}


