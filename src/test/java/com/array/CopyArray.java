package com.array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		

	}

}
