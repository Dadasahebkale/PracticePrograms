package com.string;

public class ExtractWords {

	public static void main(String[] args) {
		String str="www.google.com";
		//extracts first four characters
		
		String firstfour=str.substring(0, 4);
		System.out.println(firstfour);
		//extracts last four characters
		
		String lastchar=str.substring(str.length()-4,str.length());
		System.out.println(lastchar);
		
		String webSite=str.substring(4,str.length()-4);
		System.out.println(webSite);

	}

}
