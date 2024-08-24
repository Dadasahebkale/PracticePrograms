package com.string;

public class StringManuplation {

	public static void main(String[] args) {
		String str="The rains have started here simla";
		String str1="The rains Have started here simla";
		String s3="API Selenium is";
		System.out.println(str.length());//count of string including spaces =33
		System.out.println(str.charAt(5)); //character at 5th index =a
		System.out.println(str.indexOf('s')); // index position of 1st occurrence of s=8
		System.out.println(str.indexOf('s',str.indexOf('s')+1)); //second occurrence of s=15
		//System.out.println(str.indexOf('s',str.indexOf('s')+1,str.indexOf('s')+2)); //please find 3rd occurrence of char
		
		System.out.println(str.indexOf("have"));// index of word 10
		System.out.println(str.indexOf("Hello")); // getting -1 because hello not available in the string
		
		//string comparison
		System.out.println(str.equals(str1));// false because java is case sensitive
		//equalIgnoreCase
		System.out.println(str.equalsIgnoreCase(str1)); //true
		
		//substring
		System.out.println(str.substring(0, 9));// The rains
		System.out.println(s3.substring(4,12));//Selenium
		
		//Trim : use to remove before space and after space
		String s="  Hello Java   ";
		System.out.println(s.trim());// Hello Java
		
		System.out.println(s.replace(" ", ""));// remove the space between two words
		String date="01/01/2024"; //01-01-2024
		System.out.println(date.replace("/", "-")); //01-01-2024
		
		//Split
		String q="Java_Selenium_Automation_Testing";
		String tool[]=q.split("_");
		for(String ss: tool) {
			System.out.println(ss);
		}
				
		//concat
		String g="care";
		System.out.println(g);
		
		System.out.println(g.concat("s"));
		
		String x="Hello";
		String y="People";
		int a=10;
		int b=19;
		System.out.println(x+y);//HelloPeople
		System.out.println(a+b);//29
		System.out.println(x+y+a+b);//HelloPeople1019 because of string concatenation is print numbers after string
		System.out.println("Welcome"+1+2+3);//Welcome123
		System.out.println(1+2+3+"Welcome");//6Welcome
		
		
	}

}
