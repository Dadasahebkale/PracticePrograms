package com.apnacollege;

public class RecursionSum {

	public static void printSum(int i,int num, int sum) {
		if(i==num) {
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		printSum(i+1,num,sum);
	}
	public static void main(String[] args) {
		printSum(1, 5, 0);
	}

}
