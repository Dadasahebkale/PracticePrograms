package com.string;

import org.testng.annotations.Test;

public class CountVowelsInString {
	@Test
	public static void vowelCount() {
		String s="Welcome to the java world";
		int vCount=0;
		for(int i=0;i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
				vCount++;
			}
		}
		System.out.println(vCount);
	}
	public static boolean isVowel(char s) {
		//String s=t.toUpperCase();
		 return s=='A'||s=='E'||s=='I'||s=='O'||s=='U'||
				 s=='a'||s=='e'||s=='i'||s=='o'||s=='u';
	}

}
