package com.practiceprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		getPalindorm();	
	}
	public static void getPalindorm() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bumber to check palindrom : \n");
		int num=sc.nextInt();
		int sum=0, rem=0, temp;
		temp=num;
		while(num>0){
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not palindrome number");
		}
	
	}
}
