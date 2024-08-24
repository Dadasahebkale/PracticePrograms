package com.practiceprograms;

public class SumOfDigitsDemo {

	public static void main(String[] args) {
		int num=123456789,sum=0,rem=0,temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);

	}

}
