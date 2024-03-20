package com.practiceprograms;

public class SumOfOddNum {

	public static void main(String[] args) {
//		int count=0;
//		for(int i=0;i<100;i++) {
//			if(i%2!=0) {
//				count++;
//			}
//		}
//		System.out.println(count);
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				//System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
