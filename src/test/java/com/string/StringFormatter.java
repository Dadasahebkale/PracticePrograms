package com.string;

public class StringFormatter {

	public static void main(String[] args) {
		
		System.out.println(reverseWord("Apple and Orange are brothers"));
	}
	public static String reverseWord(String str) {
		String words[]=str.split("\\s");
		String rev="";
		for(String w :words) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			rev+=sb.toString()+" ";
		}
		return rev.trim();
	}

}
