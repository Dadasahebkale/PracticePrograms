package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWords1 {
	
	public static void main(String[] args) {
		dupWords("Ganesh is good boy, Ganesh is mature");
	}
	public static void dupWords(String str) {
		String words[]=str.toLowerCase().split("\\W+");
		Map<String, Integer> wordsCount=new HashMap<String, Integer>();
		for(String word : words) {
			if(wordsCount.containsKey(word)) {
				wordsCount.put(word, wordsCount.get(word)+1);
			}else {
				wordsCount.put(word, 1);
			}
		}
		Set<String> wordString=wordsCount.keySet();
		for(String word :wordString) {
			if(wordsCount.get(word)>1) {
				System.out.println(word+" : "+wordsCount.get(word));
			}
		}
	}

}
