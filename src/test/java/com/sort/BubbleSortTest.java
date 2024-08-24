package com.sort;

import java.util.Arrays;

public class BubbleSortTest {

	public static void main(String[] args) {
		int a[]= {4,5,6,7,2,1,9};
		System.out.println("Before sorting Arrays : "+Arrays.toString(a));
		int len=a.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting Arrays  : "+Arrays.toString(a));
	}

}
