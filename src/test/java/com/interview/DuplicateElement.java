package com.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String names[]= {"java","C","JavaScript","Selenium","Automation","Java","TestNG"};
		//compare each element
		for(int i=0;i<names.length;i++) {
			for(int j=i+i;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
			}
		}
	
	System.out.println("***********HashSet********************");
	//2 using hashSet : Java Collection it stores unique values :: O(n)
	
	//String a[]= {"java","C","JavaScript","Selenium","Automation","Java","TestNG"};
		Set<String> store=new HashSet<String>();
		
		for(String name : names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate element is "+name);
			}
		}
		
		System.out.println("***************HashMap****************");
		String s[]= {"java","C","JavaScript","Selenium","Automation","Java","TestNG"};
		
		Map<String,Integer> storeMap=new HashMap<String, Integer>();
		for(String name : s) {
			Integer count=storeMap.get(name);
			if(count==null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}
		Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
		for(Entry<String,Integer> entry :entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate element is :: "+entry.getKey());
			}
		}
		
	}
	
}
