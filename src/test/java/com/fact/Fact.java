package com.fact;

public class Fact {

	public static void main(String[] args) {
		System.out.println(fact(5));
		//System.out.println(getFact(5));

	}
	public static int fact(int num) {
		int fact=1;
		if(fact==0)
			return 1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
