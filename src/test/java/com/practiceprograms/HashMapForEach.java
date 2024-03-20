package com.practiceprograms;

import java.util.HashMap;

public class HashMapForEach {

	public static void main(String[] args) {
	
		HashMap<String, Integer> movies=new HashMap<String,Integer>();
		movies.put("Three Idiots", 600);
		movies.put("Tanaji", 500);
		movies.put("Bajirao Mastani", 400);
		
		movies.forEach((key, value)->{
			System.out.println(key+" : "+value);
		});

	}

}
