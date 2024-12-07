package com.streamjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,10,20,30,15,4,78,34,89,16,13,89);
		int secH=list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secH);
		int secL=list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secL);
	}

}
