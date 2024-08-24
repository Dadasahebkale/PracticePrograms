package com.string;

public class CountOfCharacter1 {

	public static void main(String[] args) {
		//take a string
		String str="Welcome to the new world of java coding";
		int result=str.length()-str.replaceAll("e", "").length();
		System.out.println(result);

	}

}
