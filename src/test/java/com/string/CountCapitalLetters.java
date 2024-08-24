package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountCapitalLetters {

	public static void main(String[] args) {
		// using simple approach
		String str = "DadaSahebKaleAutomationTesterZ";
		int count = 0;
		int allcharCount = str.length();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println("Capts letters in string : " + count);
		System.out.println("Total small letters :" + (allcharCount - count));

		// using asci value

		int count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count1++;
			}
		}
		System.out.println("Capts Letters are :" + count1);
		// 3 using character class
		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count2++;
			}
		}
		System.out.println("Using character class :"+count2);
		// 4 using streams
		long count3=str.chars().filter(e-> e >=65 && e<=90).count();
		System.out.println("Using Stream and asci :"+count3);
		//5 using streams
		
		long count4=str.chars().filter(d->Character.isUpperCase(d)).count();
		System.out.println("Using character class :"+count4);
		//using reg expression
		String reg="[A-Z]+";
		Pattern pattern=Pattern.compile(reg);
		Matcher matcher=pattern.matcher(str);
		pattern.matcher(str);
		int count5=0;
		while(matcher.find()) {
			count5+=matcher.group(0).length();
		}
		System.out.println("Using Regular expressio :"+count5);
		
	}
}