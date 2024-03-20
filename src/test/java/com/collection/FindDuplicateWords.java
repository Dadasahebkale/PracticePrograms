package com.collection;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) {
		FindDupWords();

	}
	public static void FindDupWords() {
		
		String str="the compulsory contribution to state revenue, levied by the government on workers income and business"
				+ "profits or added to the cost of some goods services and transactions we are study compulsory all java concepts";
		
		String[] words=str.split(" ");
		Set<String> setOfWords=new HashSet<String>();
		Set<String> duplicateWords=new HashSet<String>();
		for(String word :words) {
			if(setOfWords.add(word)==false) {
				duplicateWords.add(word);
			}
		}
		System.out.println("Duplicate words are :"+duplicateWords);
	}

}
