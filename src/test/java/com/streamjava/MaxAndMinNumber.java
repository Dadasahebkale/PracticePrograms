package com.streamjava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {

	public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(11,13,14,15,17,18,19);
	int max=numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(max);
	int min=numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(min);

	}

}
