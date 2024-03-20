package com.string;

public class StringDemo {

	public static void main(String[] args) {

		String a="Hello"; // String literal-mutable
		String b="Hello";
		String c=a.concat("World");
		System.out.println(a);// only hello will get printed as we know string is mutable
		System.out.println(c);// String created another variable to manipulate string a and concat "world" keyword
		String s=new String("Hello");
		String s1=new String("Hello");// string class creates new object every time in memory
		System.out.println(a.equals(b)); //only value will be match
		System.out.println(a==b); //true : matching object references on the heap memory
		System.out.println(a.equals(s));// True :equals method check content 
		System.out.println(a==s);//false Fails to match the references
		System.out.println(s==s1);//false Fails to references are different as they are defined with String class
		
		
		//Stringbuilder and Stringbuffer -mutable
		
		StringBuffer sb=new StringBuffer("Hello");
		
		
	}

}
