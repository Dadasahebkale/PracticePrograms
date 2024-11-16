package com.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IntStringArray {

	public static void main(String[] args) {
		int intArray[]= {1,2,3,4};
		String strArray[]= {"Apple","Banana","Graps","Mango"};
		Map<Integer, String> map=new HashMap<Integer, String>();
		for(int i=0;i<intArray.length;i++) {
			map.put(intArray[i], strArray[i]);
			
		}
		for(Entry<Integer, String> entry: map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

}
