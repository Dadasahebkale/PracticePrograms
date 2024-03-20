package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DupWord {

	public static void main(String[] args) {
		getDuplicateWords();
		StringToArray();
	}
	public static void getDuplicateWords() {
		String str="Oviya is good girl she likes to play football she is intelligent girl she got best intelligent student award";
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
	public static void StringToArray() {
		String str="We are here to welcome you in the aspecious occasion of our family";
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(str.split(" ")));
		System.out.println(list);
	}

}
