package com.programs;

public class Fact {

	public static void main(String[] args) {
		System.out.println(fact(4));
		System.out.println(getFact(5));

	}
	public static int fact(int num) {
		int f=1;
		if(num==0) 
			return 1;
			for(int i=1;i<=num;i++) {
				f=f*i;
			}
			return f;
	}
	
	public static int getFact(int num) {
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
