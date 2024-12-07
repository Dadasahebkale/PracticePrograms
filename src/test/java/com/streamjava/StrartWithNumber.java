package com.streamjava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StrartWithNumber {

	public static void main(String[] args) {
		getStrartWith();
		getNums();
	}
	public static void getStrartWith() {
		List<Integer> numbers=Arrays.asList(2,22,34,12,567,222,890,432,556,77,88,98,214,267);
		List<Integer> numWith=numbers.stream().map(e->String.valueOf(e))
		.filter(e-> e.startsWith("2"))
		.map(Integer::valueOf)
		.collect(Collectors.toList());
		System.out.println(numWith);
	}
	public static void getNums() {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,14,13,15,16,22,21,23,24);
		Optional<Integer> numWith=numbers.stream().map(e->String.valueOf(e))
				.filter(e->e.startsWith("1"))
				.map(Integer::valueOf)
				.reduce((a,b)->a+b);
		System.out.println(numWith);
	}

}
