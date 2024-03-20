package com.practiceprograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num=153;int sum=0,rem=0,temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong number");
		}else {
		System.out.println("Not armstrong number");
	}
	}
}
