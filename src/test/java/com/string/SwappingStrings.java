package com.string;

public class SwappingStrings {

	public static void main(String[] args) {

		String a="Hello";
		String b="World";
		System.out.println("Before swapping a and b ");
		System.out.println("Before swapping a is ==> "+a);
		System.out.println("Before swapping b is ==> "+b);

		//1 append a and b
		a=a+b; //HelloWorld
		
		//store initial string a and string b
		b=a.substring(0,a.length()-b.length());
		
		//store initial sting b and string a
		a=a.substring(b.length());
		
		System.out.println("After swapping a and b value is");
		System.out.println("After swapping a is ==> "+a);
		System.out.println("After swapping b is ==> "+b);
	}

}
