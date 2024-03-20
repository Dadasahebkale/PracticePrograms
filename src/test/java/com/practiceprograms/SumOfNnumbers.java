package com.practiceprograms;

public class SumOfNnumbers {

	public static void main(String[] args) {
		getSum(10);

	}
	public static void getSum(int num) {
		System.out.println("Sum of "+num+" is :");
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
