package com.interview.java;

public class FinallyBlock {

	public static void main(String[] args) {
	
		int m=getMarks("tom");
		System.out.println(m);
	}
	public static int getMarks(String name) {
		if(name.equals("tom")) {
			try {
				int i=9/0;
				return 100;
			} catch (ArithmeticException e) {
				return 60;
			}finally {
				return 40;
			}
		}
		else if(name.equals("peter")) {
			return 95;
		}else {
			return -1;
		}
	}
	
}