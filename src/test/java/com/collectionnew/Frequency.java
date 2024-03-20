package com.collectionnew;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.poifs.filesystem.Entry;

public class Frequency {

	public static void main(String[] args) {
		String str="Progrramming is the process of creating a set of instructions that tell a computer how to perform a specific task";
		String[] words=str.split(" ");
		Map<String, Integer> frequency=new HashMap<String, Integer>();
		for(String word : words) {
			if(!frequency.containsKey(word)) {
				frequency.put(word, 1);
			}else {
				int preFreq=frequency.get(word);
				frequency.put(word, preFreq+1);
			}
		}
//		frequency.forEach((k,v)->{
//			System.out.println(k+" : "+v);
//		});
		Set<java.util.Map.Entry<String, Integer>> pairs=frequency.entrySet();
		for(java.util.Map.Entry<String, Integer> pair : pairs) {
			System.out.println(pair.getKey()+" : "+pair.getValue());
		}
	}
	
}
