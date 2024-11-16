package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		String s[]= {"Apple","Mango","Graps","Banana"};
		Map<Integer, String> map=new HashMap<Integer, String>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<s.length;j++) {
				
			}
		}
		
		for(int i : a) {
			for(String ss : s) {
				if(map.containsKey(i)) {
					map.put(i, ss);
				}
				System.out.println(i+" "+ss);		
			}
			
		}
		
	}
	}


