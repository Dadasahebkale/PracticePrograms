package com.string;

import io.opentelemetry.api.internal.StringUtils;

public class RemoveWhiteSpaces {
//Remove all while spaces in the string
	public static void main(String[] args) {
		String str="    This is my  java code        "
				+"java course"
				+" Selenium  ";
		
		System.out.println(str.trim());// trim method
		System.out.println(str.replaceAll("\\s+", " ")); // replaceall method
	//	String remString=StringUtils.deleteWhitespace(str); // string utils method + delete
		//System.out.println(remString);
		
		System.out.println("============================");
		System.out.println(str);
		
		String nowhiteSpace="";
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)!=' ')&& (str.charAt(i)!='\t')) {
				nowhiteSpace=nowhiteSpace+str.charAt(i);
			}
		}
		System.out.println(nowhiteSpace);
		System.out.println("============================");
		String t = "   This         is    my             new              java           code";
		System.out.println(t.replaceAll("\\s+", " ").trim());
	}

}
