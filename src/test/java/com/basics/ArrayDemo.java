package com.basics;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		reverseString("Welcome");
		System.out.println(getRev("Welcome"));
		System.out.println(getRevse("Ganesh"));
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("Oviya");
		list.add(1);
		list.add(1.3);
		System.out.println(list);
		
		for(Object o : list) {
			System.out.print(o+",");
		}
		System.out.println("=======================");
		ArrayList<Object> l=new ArrayList<Object>();
		System.out.println("=======================");
		l.add("Dada");
		l.add(1);
		l.add(12.3);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
	public static void reverseString(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	}
	public static String getRev(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	public static String getRevse(String str) {
		String rev="";
		str=str.toLowerCase();
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}

}
