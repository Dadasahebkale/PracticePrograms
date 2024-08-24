package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWords {

	public static void main(String[] args) {
		duplicateWord("Big black bug bit a big black dog on his big black nose");
		duplicateWord("java is my java");
	}

	public static void duplicateWord(String str) {
		// String str="Big black bug bit a big black dog on his big black nose";
		String words[] = str.toLowerCase().split(" ");
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}
		Set<String> wordstring = wordCount.keySet();

		for (String word : wordstring) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
	}
}
