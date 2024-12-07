package com.interview.java;

public class BreakWithoutLoop {

	public static void main(String[] args) {
	
		boolean flag=true;
		if(flag) {
			System.out.print("test");
			//break;  // break only applicable with loops
		}else {
			System.out.print("Java");
		}
		System.out.print("Bye");
	}
	

}
