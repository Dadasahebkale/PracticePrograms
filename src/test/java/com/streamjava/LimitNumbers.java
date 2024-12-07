package com.streamjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,5,3,4,7,9,8,6);
		List<Integer> l=list.stream().sorted().limit(5).collect(Collectors.toList());
		int sum=list.stream().limit(4).reduce((a,b)->a+b).get();
		System.out.println(l);
		System.out.println(sum);
		//skip 5st numbers
		List<Integer> skip=list.stream().skip(5).collect(Collectors.toList());
		System.out.println(skip);
		//sum after skipping 5 numbers
		int sumOfSkip=list.stream().skip(5).reduce((a,b)->a+b).get();
		System.out.println(sumOfSkip);
	}

}
