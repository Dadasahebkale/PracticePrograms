package com.string;

import java.util.HashMap;
import java.util.Map;

public class CountEachWord1 {

	public static void main(String[] args) {
		getWordCount("We are are are palying cricket cricket");
	}
	public static void getWordCount(String str) {
		//String str="I am automation tester in java automation tester with selenium";
		Map<String, Integer> map=new HashMap<String, Integer>();
		Integer count=1;
		String []arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(String x : map.keySet()) {
			System.out.println("The count of words is :"+x+" = "+map.get(x));
		}
	}

}
