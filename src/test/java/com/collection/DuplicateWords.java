package com.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		String str="Oviya is good girl she is intelligent but also very clever girl she likes to study hard";
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
