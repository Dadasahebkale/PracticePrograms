package com.collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashTableDemo {

	public static void main(String[] args) {
		/*
		 HashMap					| 				HashTable
		 1. Non-Synchornized		| 1. Synchronized
		 2.Multiple Thread allowed  } 2. One Thread allowed at a time
		 3.No thread safe			| 3. Thread safe
		 4.Performance faster		| 4. Low performance
		 5.Null can be accepted as  | 5. Null cannot accept(key and value)
		   key one time and value 
		   multiple time	
		 6. Insertion order not pere| 6. Insertion order not preserved
		    -served
		 * */
		Hashtable<Integer, String> t=new Hashtable<Integer, String>();
		t.put(101, "Ganesh");
		t.put(102, "Oviya");
		t.put(103, "Pranvai");
		t.put(104, "Pranav");
		t.put(105, "Dada");
		//t.put(null, null); getting NullPointerException
		System.out.println(t);//{105=Dada, 104=Pranav, 103=Pranvai, 102=Oviya, 101=Ganesh}
		ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<Integer, String>();
		chm.putAll(t);
		chm.put(106, "English");
		chm.put(107, "Maths");
		chm.put(108, "Science");
		chm.put(109, "Social Scinece");
		chm.put(110, "Marathi");
		//chm.put(null, "X"); getting NullPointerException
		//chm.put(111, null); getting NullPointerException
		
		for(Map.Entry o : chm.entrySet()) {
			System.out.println(o.getKey()+" : "+o.getValue());
		}
		// get method
		System.out.println(t.get(102));//Oviya
		// remove method
		System.out.println(t.remove(105));//Dada
		System.out.println(t);//{104=Pranav, 103=Pranvai, 102=Oviya, 101=Ganesh}
		
		//containsKey =true or false
		System.out.println(t.containsKey(101));//true need to enter key
		System.out.println(t.containsKey(111));//false
		
		//containsValue true or false
		System.out.println(t.containsValue("Oviya")); //present
		System.out.println(t.containsValue("O")); // not present
		// keySet: used for retrive keys
		System.out.println(t.keySet()); //[104, 103, 102, 101]
		// values : used for get values
		System.out.println(t.values());//[Pranav, Pranvai, Oviya, Ganesh]
		
		// using keySet to get key and values
		for(Object k: t.keySet()) {
			System.out.println(k+" : "+t.get(k)); // getting key and values
		}
		
		// using entrySet()
		System.out.println("Using enterySet method");
		for(Map.Entry entry : t.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		// using iterator
		System.out.println("Using iterator");
		Set m=t.entrySet();
		Iterator it=m.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
	}

}
