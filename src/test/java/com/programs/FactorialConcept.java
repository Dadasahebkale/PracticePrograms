package com.programs;

public class FactorialConcept {

	public static void main(String[] args) {
		
		System.out.println(factNumber(4));
		System.out.println(factNumber(3));
		System.out.println(factNumber(6));
		System.out.println(factNumber(1));
		System.out.println(factNumber(0));
		System.out.println(factNumber(10));
		System.out.println(factNumber(15));
	}
	public static int factNumber(int num) {
		System.out.println("Factorial of number "+num);
		// 4=4*3*2*1
		//3=3*2*1
		//2=2*1
		//5=5*4*3*2*1
		//6=6*5*4*3*2*1
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
