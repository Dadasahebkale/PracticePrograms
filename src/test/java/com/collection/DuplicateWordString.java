package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordString {

	public static void main(String[] args) {
		findDuplicateWords("java Hey java is best language is in the java world");
		findDuplicateWords("please please please work hard please");
		findDuplicateWords("100 200 100 200 100 300 300 300 300");
	}
	public static void findDuplicateWords(String inputString) {
		
		//Split
		String words[]=inputString.split(" ");
		//create hashMapt
		Map<String,Integer> wordCount=new HashMap<String,Integer>();
		//to check each word in given array
		for(String word :words) {
			//if word present:
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
			}else {
				wordCount.put(word, 1);
			}
		}
		//Extracting all the keys of map -wordCount
		Set<String> wordsStrings=wordCount.keySet();
		
		//loop through all the words in wordCount
		for(String word : wordsStrings) {
			if(wordCount.get(word)>1) {
				System.out.println(word+" : "+wordCount.get(word));
			}
		}
	}

}
