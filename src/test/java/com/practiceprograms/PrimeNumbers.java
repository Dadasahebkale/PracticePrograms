package com.practiceprograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		getPrimeNum(100);

	}
	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void getPrimeNum(int num) {
		for(int i=2;i<num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
