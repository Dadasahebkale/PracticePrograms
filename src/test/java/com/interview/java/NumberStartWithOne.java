package com.interview.java;

import java.util.ArrayList;
import java.util.List;

public class NumberStartWithOne {

	public static void main(String[] args) {
		int arr[]= {1,134,167,34,37,38,87,66,199};
		System.out.println(getNumberList(arr));
	}
	public static int getFirstDigit(int num) {
		while(num>=10) {
			num=num/10;
		}
		return num;
	}
	public static List<Integer> getNumberList(int arr[]) {
		List<Integer> numbers=new ArrayList<Integer>();
		for(int num : arr) {
			int n=getFirstDigit(num);
			if(n==1) {
				numbers.add(num);
			}
		}
		return numbers;
	}

}
