package com.streamjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumbers {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,4,3,5,9,6,8,7,2,4,5);
		List<Integer> sortedNums=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNums);
		List<Integer> reverse=list.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverse);
	}

}
