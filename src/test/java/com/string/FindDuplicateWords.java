package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) {
		// assign string
		String str="Ganesh is good boy he is like to learn every day Ganesh is wonderful boy he likes to play cricket";
		//string converted using split method
		String [] words=str.split(" ");
		//using set<string> interface to find unique value
		Set<String> setOfWords=new HashSet<String>();
		//
		Set<String> duplicateWords=new HashSet<String>();
		for(String word : words) {
			if(setOfWords.add(word)==false) {
				duplicateWords.add(word);
			}
			
		}
		System.out.println(duplicateWords);
		
	}

}
