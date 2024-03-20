package com.programs;

public class OneToHundred {

	public static void main(String[] args) {
		withoutSemicoln();
		append();
	}
	public static void printOneToHundred() {
		int one='A'/'A';
		String str="..........";

		for(int i=one;i<=(str.length()*str.length());i++) {
		System.out.println(i);
			
		}
		
		for(int i=one;i<='d';i++) {
		System.out.println(i);
		}
	}
	public static void withoutSemicoln() {
		if(System.out.printf("Hello World"+"\n")== null) {
			
		}
	}
	public static void append() {
		if(System.out.append("Hello Java World")== null) {
			
		}
	}

}
