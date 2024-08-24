package com.array;

import java.util.Arrays;

public class ShiftZerotoRight {
	public static int[] shiftZeroToRight(int [] a) {
		if(a.length==1) {
			return a;
		}
		int newArray[]=new int[a.length];
		int count=0;
		for(int number : a) {
			if(number!=0) {// non zero number
				newArray[count]=number;
				count++;
			}
		}
		return newArray;
	}
	public static int[] shiftLeftZero(int a[]) {
		if(a.length==1) {
			return a;
		}
		int newArray[]=new int[a.length];
		int count = 0;
		for (int num : a) {
			if(num == 0) { 
				newArray[count]=num;
				count++;
			}
		}
		for(int num : a) {
			if(num !=0) {
				newArray[count]=num;
				count++;
		        }
		}
		return newArray;
	}

	public static void main(String[] args) {
		// Test cases
		int [] i=new int[] {1,0,2,4,0,0,0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		i=new int[] {1,2,3,0,0,0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		i=new int[] {0,0,0,5,4,3,2};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		i=new int[] {5,4,3,2};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		i=new int[] {0,0,0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		i=new int[] {0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		i=new int[] {1};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		i=new int[] {};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		i=new int[] {1,0,2,4,0,0,0,8,3};
		System.out.println(Arrays.toString(shiftLeftZero(i)));
	}

}
