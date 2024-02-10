package com.programs;

public class ReverseString {

	public static void main(String[] args) {

		revTest();
		reT();
	}
	public static void revTest() {
		
		String str="Welcome";
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
			
		}
		System.out.println(rev);
	}
	public static void reT() {
		String str1="Selenium";
		int l=str1.length();
		String rev="";
		
		for(int i=l-1;i>=0;i--) {
			rev=rev+str1.charAt(i);
		}
		System.out.println(rev);
	}

}
