package com.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("1 is prime number :"+isPrimeNumber(1));
		System.out.println("2 is prime number :"+isPrimeNumber(2));
		System.out.println("11 is prime number :"+isPrimeNumber(11));
		System.out.println("0 is prime number :"+isPrimeNumber(0));
		System.out.println("-1 is prime number :"+isPrimeNumber(-1));
		System.out.println("20 is prime number :"+isPrimeNumber(20));
		getPrimeNumbers(100);
	}
	public static boolean isPrimeNumber(int num) {
	
	if(num<=1) {
		return false;
	}
	for(int i=2;i<num;i++) {
		if(num %i==0) {
			return false;
		}
	}
	return true;
}
	public static void getPrimeNumbers(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+ " ");
			}
		}
	}
}
