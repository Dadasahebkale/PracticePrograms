package com.string;

public class SubString {

	public static void main(String[] args) {
		System.out.println(isSubString("Dadasaheb Kale automation tester", "tester"));

	}
	
	public static boolean isSubString(String main,String sub) {
		return main.matches("(.*)"+sub+"(.*)");
	}
	

}
