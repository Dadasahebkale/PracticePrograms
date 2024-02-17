package com.interview;

import java.util.Arrays;

public class SmallesandLargestNumber {

	public static void main(String[] args) {
		
		int numbers[]= {1,23,44,-10,-99,232};
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				smallest =numbers[i];
				
			}
		}
		System.out.println("\n given array "+Arrays.toString(numbers));
		System.out.println("Largest number is "+largest);
		System.out.println("Smallest number is "+smallest);
	}

}
