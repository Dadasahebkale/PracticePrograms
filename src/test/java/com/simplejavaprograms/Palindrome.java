package com.simplejavaprograms;

public class Palindrome {

	public static void main(String[] args) {
		
		isPrimeNumber(151);
		isPrimeNumber(150);
		isPrimeNumber(121);
		isPrimeNumber(-151);
		isPrimeNumber(-151);
	}
	public static void isPrimeNumber(int num) {
		System.out.println("Palindrome number for "+num);
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not palindrome number");
		}
	}
}
