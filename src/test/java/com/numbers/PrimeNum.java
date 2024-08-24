package com.numbers;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println(isPrime(0));
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(531));
		getPrime(12);
		}
	public static boolean isPrime(int num) {
		//corner cases
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}
	public static void getPrime(int num) {
	
		for(int i=2;i<=num;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
