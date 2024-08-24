package com.programs;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(fact(5));
		System.out.println(fact(4));
		System.out.println(fact(1));
		System.out.println(fact(0));
		
		System.out.println(factrecursive(10));
		System.out.println(factrecursive(1));
		System.out.println(factrecursive(0));
	}
	public static int fact(int num) {
		//System.out.println("Factorial for the :"+num);
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	//Recursive function: a function is calling itself
	
	public static int factrecursive(int num) {
	//	System.out.println("Factorial for the :"+num);
		if(num==0)
			return 1;
		else
			return( num * factrecursive(num-1));
	}

}
