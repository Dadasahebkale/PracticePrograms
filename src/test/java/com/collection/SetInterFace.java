package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterFace {

	public static void main(String[] args) {
		
		getSet();
		getList();
	}
	public static void getSet() {
		
		Set<String> list=new HashSet<String>();
		list.add("List");
		list.add("Set");
		list.add("ArrayList");
		list.add("HashSet");
		list.add("Map");
		list.add("HashMap");
		list.add("LinkedList");
		System.out.println("-----------------------");
		for(String s : list) {
			
			System.out.println(s);
		}
		System.out.println("-----------------------");
		Iterator<String> l=list.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
			
		}
	}
	public static void getList() {
		System.out.println("Using set interface and iterator to iterate data");
		Set<String> strOfList=new HashSet<String>();
		strOfList.add("List->LiknkedList");
		strOfList.add("List->ArrayList");
		strOfList.add("set->HashSet");
		strOfList.add("Map->HashMap");
		strOfList.add("Selenium Java");
		
		Iterator<String> it=strOfList.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		System.out.println("-----------------using enhanced for loop");
		for(String s :strOfList)
		System.out.println(s);
	}


}
