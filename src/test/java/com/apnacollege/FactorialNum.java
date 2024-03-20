package com.apnacollege;

public class FactorialNum {
	public static int printFact(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		int fact=printFact(num-1);
		int f=fact*num;	
		return f;
	}

	public static void main(String[] args) {
		System.out.println(printFact(5));

	}

}
