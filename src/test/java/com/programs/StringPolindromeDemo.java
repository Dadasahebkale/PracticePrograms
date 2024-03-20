package com.programs;

public class StringPolindromeDemo {

	public static void main(String[] args) {
		getPolindrome("naman");
		getPolindrome("Radar");
		getPolindrome("Welcome");
	}
	public static void getPolindrome(String str) {
		System.out.println("Given String is "+str);
		
		String rev="";
		for(int i=(str.length()-1);i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(str+" is polindrome");
		}else {
			System.out.println(str+" is not polindrome");
		}
	}

}
