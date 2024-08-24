package com.string;

public class StringCount {

	public static void main(String[] args) {
		String str="Automation";
		int vCount=0;
		String s=str.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
			vCount++;
		}
		}
		System.out.println("Vowel count : "+vCount);
		
	}
	public static boolean isVowel(char c) {
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}

}
