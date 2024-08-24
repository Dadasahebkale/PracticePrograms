package com.string;

public class Palindrome {

	public static void main(String[] args) {
		String palindrome=new String("Rod saw I was Dor");
		int len=palindrome.length();
		String des=new String();
		for(int i=(len-1);i>=0;i--) {
			des=des+palindrome.charAt(i);
		}
		System.out.format("%S%n",des.toString());

	}

}
