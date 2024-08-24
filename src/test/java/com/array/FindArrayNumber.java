package com.array;

import java.util.Arrays;

public class FindArrayNumber {

	public static void main(String[] args) {

		int [] arr= {23,45,57,34,67,77,87,89,90,88,99};
		int n=arr.length;
		Arrays.sort(arr);
		System.out.println("The highest integer :"+arr[n-1]);
		System.out.println("The Second highest integer :"+arr[n-2]);
	}

}
