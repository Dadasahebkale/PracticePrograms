package com.string;

public class CountOfCharacter {

	public static void main(String[] args) {
		getcharCount("Java is object oriented langage");

	}
	public static void getcharCount(String str) {
		//String str="Java is object oriented langage";
		int result=str.length()-str.replaceAll("a", "").length();
		//We have to count all string
		// we have to substract after replacing character with blank space
		System.out.println(result);
	}

}
