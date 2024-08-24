/**
 * 
 */
package com.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class ReadWordsandCount {
	static String path="E:\\Preparation\\Word.txt";
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader(path));
			String currentLine=reader.readLine();
			while(currentLine !=null) {
				
				String words[]=currentLine.toLowerCase().split(" ");
				for(String word :words) {
					if(!word.isBlank()) {
					if(map.containsKey(word)) {
						map.put(word, map.get(word)+1);
					}else {
						map.put(word, 1);
					}
				}
				}
				currentLine=reader.readLine();
			}
		}catch(Exception e) {
			System.out.println("Some Exception is coming.....");
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		map.forEach((keys,value)->System.out.println("Count of words is "+keys+" : "+value));
		Map<String, Integer> maxMap=new HashMap<String, Integer>();
		map.entrySet().stream()
			.filter(entry->entry.getValue()==Collections.max(map.values()))
				.forEach(e->maxMap.put(e.getKey(), e.getValue()));
		System.out.println("===========Maximum Value===========");
		System.out.println(maxMap);
	}

}
