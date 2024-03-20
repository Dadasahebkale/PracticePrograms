package com.practiceprograms;

public class PrimeTest {

	public static void main(String[] args) {
		getprime(30);

	}

	public static void getprime(int num) {
		for(int i=2;i<num;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
	public static boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}

}
