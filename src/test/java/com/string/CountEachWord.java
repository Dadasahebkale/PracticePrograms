package com.string;

import java.util.HashMap;
import java.util.Map;

public class CountEachWord {

	public static void main(String[] args) {
		String str="I am learning java java language";
		Map<String, Integer> map=new HashMap<String, Integer>();
		Integer count=1;
		String [] s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			if(map.containsKey(s[i])) {
				//map.put(s[i], count);
				map.put(s[i], map.get(s[i])+1);
			}else {
				//map.put(s[i], map.get(s[i])+1);
				map.put(s[i], count);
			}
		}
		for(String x :map.keySet()) {
			System.out.println("The word count : "+x+" = "+map.get(x));
		}

	}

}
