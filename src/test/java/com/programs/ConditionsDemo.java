package com.programs;

import java.util.Scanner;

public class ConditionsDemo {

	public static void main(String[] args) {
		getIfElse();
	}
	public static void getIfElse() {
		Scanner sc=new Scanner(System.in);
		int a=0,b=0;
		System.out.println("Enter the value of a and b ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a==b) {
			System.out.println("Both Equal");
		}else if(a>b) {
			System.out.println("A is greater than b");
		}else {
			System.out.println("A is lesser");
		}
	}

}
