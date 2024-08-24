package com.string;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LargestSmalles {
	@Test
	public void LargestTest() {
		int arr[]= {12,3,4,5,5,6,7,8,9,11,23,456,34};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Largest number "+largest);
		System.out.println("Smallest number "+smallest);
	}
	@Test
	public void largeTest() {
		int arr[]= {1,3,4,5,7,8,9,22,43,65,2,6,-2};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Largest number "+largest);
		System.out.println("Smallest number "+smallest);
	}

}
