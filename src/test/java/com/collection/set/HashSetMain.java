package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		//Duplicate not allowed
		//insertion order not preserved
		//HashCode- We can insert Element
		//No index concept in HashSet
		//Heterogeneous data will be supported
		//Null value will be accepted
		//Searching will be faster
		//No Special method in HashSet/ it will implement method from set(I)
		//16 will be default size
		// load factor/fill ratio 0.75
		//if default size 16 is completed and more than 16 element added and another object
		//will be created previous object copy into other element first object moved to GB
		
		HashSet set=new HashSet();
		set.add(100);
		set.add("Welcome");
		set.add(16.4);
		set.add('A');
		set.add(100);
		set.add(true);
		set.add(null);
		set.add("Hello");
		System.out.println(set);
		set.remove(null);
		System.out.println(set);
		System.out.println(set.contains("Hello"));
		System.out.println(set.isEmpty());
		
		// using iterator
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
