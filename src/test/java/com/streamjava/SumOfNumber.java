package com.streamjava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumber {

	public static void main(String[] args) {
		sumOf();
		sumDemo();
	}
	public static void sumOf() {
		List<Integer> list=Arrays.asList(1,4,5,6,22,3,90,89,2,3,1,4,55,6);
		Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
		System.out.println("Sum of number :"+sum.get());
	}
	public static void sumDemo() {
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> s=l.stream().reduce((a,b)->a+b);
		System.out.println("Sum of numbers :"+s.get());
	}

}
