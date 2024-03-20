package com.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordTest {

	public static void main(String[] args) {
		String str="I am working in the IT industry and IT industry is biggest in the world automation is the biggest part of the industry";
		String[] words=str.split(" ");
		Set<String> setOfWords=new HashSet<String>();
		Set<String> duplicateWords=new HashSet<String>();
		for(String word : words) {
			if(setOfWords.add(word)==false) {
				duplicateWords.add(word);
			}
		}
		System.out.println(duplicateWords);
	}

}
