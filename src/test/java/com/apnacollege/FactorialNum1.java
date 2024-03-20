package com.apnacollege;

public class FactorialNum1 {
	public static int getFact(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		int fact=getFact(num-1);
		int f=fact*num;
		return f;
	}

	public static void main(String[] args) {
		System.out.println(getFact(5));
	}

}
