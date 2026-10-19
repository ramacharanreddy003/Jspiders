package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {

//		String s="ababbabbb";
//		String exp="ab";
		// Pattern p = Pattern.compile(exp);
		// Matcher m = p.matcher(s);
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());//false
//
//		String s = "abacadaeasa#";
//		String exp = "a.";
//		Pattern p = Pattern.compile(exp);
//		Matcher m = p.matcher(s);
//		while (m.find())
//			System.out.println(m.group());
//
//		String s1 = "abacadaea5a#";
//		String exp1 = "a.a";
//		Pattern p1 = Pattern.compile(exp1);
//		Matcher m1 = p1.matcher(s1);
//		while (m1.find()) {
//			System.out.println(m1.group());
		// }

//		String a="abacadae5a#";
//		String exp2="[ab]";//matches with a or b
//		Pattern p2 = Pattern.compile(exp2);
//		Matcher m1= p2.matcher(a);
//		while(m1.find())
//			System.out.println(m1.group());

//		String s="aabbabbabcaabbb";
//		String exp="[ab][ba]";
//		Pattern p = Pattern.compile(exp);
//		Matcher m1 = p.matcher(s);
//		while(m1.find())
//			System.out.println(m1.group());

//		String s = "ab2bd44df6";
//		String exp = "[0-9]";
//		Pattern p = Pattern.compile(exp);
//		Matcher m1=p.matcher(s);
//		int sum=0;
//		while(m1.find()) sum+=m1.group().charAt(0)-'0';
//		System.out.println(sum);
		
		//sum of nums in a given alpha numeric
		
//		String s="12as@3mfk5";
//		int sum=0;
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(ch>='0' && ch<='9') {
//				sum+=ch-'0';
//			}
//		}
//		System.out.println(sum);
		
		//sum of nums
		String s="ram12#e12";
		int  sum=0,num=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				num=num*10+ch-'0';
			}else {
				sum+=num;
				num=0;
			}
		}sum+=num;
		System.out.println(sum);

	}

}
