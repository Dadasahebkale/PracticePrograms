package com.practiceprograms;

public class SumOfDigits {

	public static void main(String[] args) {
		
		getSum(12345);
		getSum(898787);
	}
	public static void getSum(int num) {
		int sum=0,rem=0,temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
