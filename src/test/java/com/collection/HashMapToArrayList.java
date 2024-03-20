package com.collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> comMap=new HashMap<String, Integer>();
		comMap.put("Google", 2000);
		comMap.put("Yahoo", 3000);
		comMap.put("Amazon", 4000);
		comMap.put("Flipkart", 9000);
		
		for(int i=0;i<comMap.size();i++) {
			System.out.println(comMap);
		}
	}

}
