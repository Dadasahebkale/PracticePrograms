package com.apnacollege;

public class FactorialDemo {

	public static void main(String[] args) {
		getFactorial(5);
		getFactorial(1);
		getFactorial(0);
		getFactorial(-1);

	}
	public static void getFactorial(int num) {
		if(num<0) {
			System.out.println("Invalid number");
			return;
		}
		int fact=1;
			for(int i=num;i>=1;i--) {
				fact=fact*i;
			}
			System.out.println(fact);
			return;
	}

}
