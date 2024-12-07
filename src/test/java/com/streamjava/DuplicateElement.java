package com.streamjava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
	public static void main(String[] args) {
		getdupNum();
		getStringDup();
		usingSet();
	}
	public static void getdupNum() {
		List<Integer> numbers=Arrays.asList(1,12,13,14,15,13,13,14);
		Set<Integer> dup=numbers.stream().filter(e-> Collections.frequency(numbers, e)>1)
		.collect(Collectors.toSet());
		System.out.println(dup);
		
	}
	public static void getStringDup() {
		List<String> names=Arrays.asList("Java","String","TestNg","Java","String","Selenium","Maven");
		Set<String> list=names.stream().filter(e->Collections.frequency(names, e)>1)
		.collect(Collectors.toSet());
		System.out.println(list);
	}
	public static void usingSet() {
		List<String> names=Arrays.asList("Java","String","TestNg","Java","String","Selenium","Maven");
		
		Set<String> set=new HashSet<String>();
		Set<String> s=names.stream().filter(e->!set.add(e)).collect(Collectors.toSet());
		System.out.println(s);
	}

}
