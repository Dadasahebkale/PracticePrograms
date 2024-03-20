package com.programs;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println(isPrimenumber(11));
		System.out.println(isPrimenumber(1));
		System.out.println(isPrimenumber(0));
		System.out.println(isPrimenumber(100));
		getprimeNumbers(20);
	}
	public static boolean isPrimenumber(int num) {
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
	public static void getprimeNumbers(int num) {
		for(int i=2;i<num;i++) {
			if(isPrimenumber(i))
				System.out.print(i+ " ");
		}
	}
}
