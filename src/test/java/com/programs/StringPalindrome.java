package com.programs;

public class StringPalindrome {

	public static void main(String[] args) {
		getPalindrome("Radar");
		getPalindrome("rear");
		getPalindrome("Naman");

	}
	public static void getPalindrome(String str) {
		
		
		String rev="";
	
		for(int i=(str.length()-1);i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(str+" Is palindrome");
		}else {
			System.out.println(str+" not palindrome");
		}
		
	}

}
