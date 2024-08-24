package com.array;

import java.util.Arrays;

public class SmallestLargest {

	public static void main(String[] args) {
		int numbers[]= {1,2,3,4,55,666,7,22,5};
		int smallest=numbers[0];
		int largest=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		System.out.println("Given array is "+Arrays.toString(numbers));
		System.out.println("Smallest number is :"+smallest);
		System.out.println("Largest number is :"+largest);

	}

}
