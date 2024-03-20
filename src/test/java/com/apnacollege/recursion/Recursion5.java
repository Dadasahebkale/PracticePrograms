package com.apnacollege.recursion;

public class Recursion5 {
	public static void printNum(int num) {
		if(num==0) {
			return;
		}
		System.out.println(num);
		printNum(num-1);
	}

	public static void main(String[] args) {
		int num=5;
		printNum(num);

	}

}
