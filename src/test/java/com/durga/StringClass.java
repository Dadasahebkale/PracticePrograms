package com.durga;

public class StringClass {

	public static void main(String[] args) {
	String str=new String("Hello");
	str.concat("World");// we didn't create object so it will not get printed and will be move to GC
	
	System.out.println(str);// Hello

	}

}
