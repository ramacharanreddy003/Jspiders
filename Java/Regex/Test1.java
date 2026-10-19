package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) {
//		String s="A1a3c#5d6ddD835";
//		String exp="[^a-z][0-9]";
		
//		String s="#2a.@.1.#.ab!.2.ww";
//		String exp="[.]";
		
		String s="#2a@1#ab!2ww";
		String exp="[^0-9a-2A-Z][0-9][A-Za-z]";
		Pattern p = Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());

	}

}
