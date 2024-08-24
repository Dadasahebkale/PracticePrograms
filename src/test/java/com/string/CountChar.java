package com.string;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
	public static void getCount(String name) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		char charArray[]=name.toCharArray();
		for(char c : charArray) {
			//if you want to avoid space then
			if(!String.valueOf(c).isBlank()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		}
		System.out.println(name+" : "+map);
	}
	public static void spaceCount(String name) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		char charArray[]=name.toCharArray();
		for(char c : charArray) {
			if(String.valueOf(c).isBlank()) {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}else {
					map.put(c, 1);
				}
			}
		}
		System.out.println("Number of space: "+map);
	}

	public static void main(String[] args) {
		
		getCount("Dadasaheb");// Dadasaheb : {a=3, b=1, s=1, D=1, d=1, e=1, h=1}
		getCount("Automation");//Automation : {A=1, a=1, t=2, u=1, i=1, m=1, n=1, o=2}
		getCount("Testing");//Testing : {s=1, T=1, t=1, e=1, g=1, i=1, n=1}
		getCount("Testing ");//Testing  : { =1, s=1, T=1, t=1, e=1, g=1, i=1, n=1}
		getCount(" Test ");//Test  : { =2, s=1, T=1, t=1, e=1}
		getCount("   ");// after including isblank method
		getCount(" Test ");//Test  : {s=1, T=1, t=1, e=1}
		spaceCount(" Test ");
	}

}
