package com.string;

public class ReplaceAllTest {

	public static void main(String[] args) {
		String str="INR 200 & INR is indian currency";
		System.out.println(str.replaceAll("[^a-zA-Z]", " "));
		System.out.println(str.replaceAll("[^0-9]",""));
	}

}
