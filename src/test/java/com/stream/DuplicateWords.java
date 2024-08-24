package com.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWords {

	public static void main(String[] args) {
		String str="Big black bug big black bucket on the big back bucket";
		String words[]=str.toLowerCase().split("\\s");
		Set<String> dataSet=new HashSet<String>();
		Set<String> dupSet=Arrays.asList(words).stream().filter(s->!dataSet.add(s)).collect(Collectors.toSet());
		System.out.println(dupSet);

	}

}
