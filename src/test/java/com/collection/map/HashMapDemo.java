package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		/* Map in interface
		 * HashMap and HashTable are class which impletments maps methods
		 * Map is collection of entries in the form of unique value and pair
		 * HashMap--->:
		 * 1. Underlying data structure in HashTable
		 * 2. Insertion order nor preserved
		 * 3. Duplicate key not allowed
		 * 4. Null key allowed only once
		 * 5. Null value accepted multiple times
		 * 6. If we have duplicate key and value then latest value will be overloaded
		 * 7. We can use HashMap when we want search operation
		 */
		//HashMap map=new HashMap();
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(101, "Ganesh");
		map.put(102, "Oviya");
		map.put(103, "Pranavi");
		map.put(104, "Pranav");
		map.put(105, "Dada");
		map.put(105, "Dadasaheb");
//		map.put(null, "Sonu");
//		map.put(null, "Monu");
//		map.put(null, "Sonu");
		map.put(106, "Kale");
		map.put(107, "Kale");
		System.out.println(map);
		System.out.println(map.containsValue("Dadasaheb"));
		
		Set<Integer> k=map.keySet();
		System.out.println(k);//[null, 101, 102, 103, 104, 105, 106, 107]
	
		System.out.println(map.get(105));//Dadasaheb
		
		System.out.println(map.values());// return type collection
		//[Sonu, Ganesh, Oviya, Pranavi, Pranav, Dadasaheb, Kale, Kale]
		System.out.println(map.containsValue("Dada"));//false
		//Entry<Integer, String> e=map.entrySet<Integer,String>();
		
		//Entry
		//Returns all the entries as Set [null=Sonu, 101=Ganesh, 102=Oviya, 103=Pranavi, 104=Pranav, 105=Dadasaheb, 106=Kale, 107=Kale]
		System.out.println(map.entrySet());
		
		for(Object i : map.keySet()) {
			System.out.println(i+" : "+map.get(i));
		}
		/*
						 null : Sonu
				101 : Ganesh
				102 : Oviya
				103 : Pranavi
				104 : Pranav
				105 : Dadasaheb
				106 : Kale
				107 : Kale
		 */
		// simple way
//		for(Map.Entry  i : map.entrySet()) {
//			System.out.println(i);
//		}
		//
		System.out.println("Entry set...");
		for(Map.Entry entry	: map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println("Using Iterator.....");
		Set m=map.entrySet();
		Iterator it=m.iterator();
		while(it.hasNext()) {
			Map.Entry entry=(Entry)it.next();// TypeCast
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	

}

