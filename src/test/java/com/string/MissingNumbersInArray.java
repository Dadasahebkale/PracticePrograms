package com.string;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MissingNumbersInArray {
	@Test
	public static void findMissingNum() {
		int myArray[]= {11,12,13,14,16,17,18,19,20};
		int sum=0;
		int expectSum=0;
		for(int i=0;i<myArray.length;i++) {
			sum=sum+myArray[i];
		}
		for(int i=11;i<=20;i++) {
			expectSum=expectSum+i;
		}
		System.out.println(Arrays.toString(myArray));
		System.out.println("Missing number is "+(expectSum-sum));

	}
	@Test
	public void findNum() {
		
		int myArray[]= {1,2,3,5,6,7,8,9,10};
		int sum=0;
		int expectedSum=0;
		for(int i=0;i<myArray.length;i++) {
			sum=sum+myArray[i];
		}
		for(int i=1;i<=10;i++) {
			expectedSum=expectedSum+i;
		}
		System.out.println(Arrays.toString(myArray));
		System.out.println("Missing number is "+(expectedSum-sum));
		System.out.println("==================================");
	}
	@Test
	public void findMissNum() {
		int myArr[]= {21,22,23,25,26,27,28,29,30};
		int sum=0;
		int eptsum=0;
		for(int i=0;i<myArr.length;i++) {
			sum=sum+myArr[i];
		}
		for(int i=21;i<=30;i++) {
			eptsum=eptsum+i;
		}
		System.out.println(Arrays.toString(myArr));
		System.out.println("Missing num is "+(eptsum-sum));
	}
	@Test
	public void a() {
		int a[]= {1,2,3,6,7,8,9,10};
		int sum=0;
		int expectedsum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		for(int i=1;i<=10;i++) {
			expectedsum=expectedsum+i;
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Missing number "+(expectedsum-sum));
	}
	@Test
	public void FindMissingNumber() {
		int arr[]= {1,2,3,4,6,7,9,10};
		int sum=0;
		int exp=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		for(int i=1;i<=arr.length+1;i++) {
			exp+=i;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println((exp-sum));
	}

}
