package com.string;

public class RemoveVowelsDemo {

	public static void main(String[] args) {
		removeVowels("We are freind\n");
		removeVowel("We are Friend");
	}
	public static void removeVowels(String s) {
		String str=s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			if(!(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')) {
				System.out.print(s.charAt(i));
			}
		}
	}
	public static void removeVowel(String s) {
		String str=s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				continue;
			}
			System.out.print(s.charAt(i));
		}
	}

}
