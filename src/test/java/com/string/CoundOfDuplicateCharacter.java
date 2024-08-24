package com.string;

import java.util.HashMap;
import java.util.Map;

public class CoundOfDuplicateCharacter {

	public static void main(String[] args) {
		String str="laptopopp";
		char[] arr=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		Integer count=1;
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(Character c : map.keySet()) {
			if(map.get(c)>1) {
			System.out.println("Count of charcter "+c+" = "+map.get(c));
		}
		}
	}

}
