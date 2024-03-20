package com.apnacollege;

public class RecursionSum1 {
	
	public static void printSum(int i,int num,int sum) {
		if(i==num) {
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		printSum(i+1,num,sum);
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSum(1, 5, 0);
	}

}
