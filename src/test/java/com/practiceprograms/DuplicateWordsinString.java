package com.practiceprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsinString {

	public static void main(String[] args) {
		String str="We have some testNG annotaions which are helpful for the manage unit test cases those annotations help us to integrate our tests our framework";
		String [] words=str.split(" ");
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
