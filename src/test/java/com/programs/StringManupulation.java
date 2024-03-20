package com.programs;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The rains have started here";
		String str1="The rains Have started here";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',str.indexOf('s')+1));
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("Hello"));
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0, 9));
		
		String s=" Hello World ";
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		
		String date="02-22-2024";
		System.out.println(date.replace("-", "/"));
		
		String test="Hello_World_New_Era_Begins";
		String splitvalue[]=test.split("_");
		for(int i=0;i<splitvalue.length;i++) {
			System.out.println(splitvalue[i]);	
		}
		
		String c="care";
		System.out.println(c.concat("less"));
		
		String x="Hello";
		String y="World";
		int a=100;
		int b=200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
	}

}
