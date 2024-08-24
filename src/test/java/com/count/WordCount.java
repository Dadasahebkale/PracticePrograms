package com.count;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		String str="Big bucket big boss big bucket    big";
		String words[]=str.toLowerCase().split("\\s"); // convert into lowercase and array
		Map<String,Integer> map=new HashMap<String, Integer>(); // use hashMap for unique key and duplicate value
		for(String word : words) { // advanced for loop for iterate array
			if(!word.isBlank()) {// if we found double while space | tab in the string then we can use this method
			if(map.containsKey(word)) { // use containsKey method to check 
				map.put(word, map.get(word)+1); // adding duplicate words
			}else {
				map.put(word, 1); // 
			}
		}
			}
		for(String x : map.keySet()) { // Using keySet() to get the set view of keys
			System.out.println("Word count is "+x+" :: "+map.get(x));
		}
		
	}

}
