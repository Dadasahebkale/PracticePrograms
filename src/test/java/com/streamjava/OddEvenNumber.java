package com.streamjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumber {

	public static void main(String[] args) {
		getEvenOdd();
	}
	public static void getEvenOdd() {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
		List<Integer> evenList=numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
		List<Integer> oddList=numbers.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println(oddList);
		
	}

}
