package com.practiceprograms;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> web=new HashMap<String, Integer>();
		web.put("Google", 1234);
		web.put("Yahoo", 8980);
		web.put("javatPoint", 13134);
		web.put("W3School", 123);
		
		System.out.println(web.get("Yahoo"));
		
		web.forEach((K,V)->{
			System.out.println(K+" : "+V);
		});
//		web.forEach(null);
//		for(int i=0;i<web.size();i++) {
//			System.out.println(web);
//		}
	}

}
