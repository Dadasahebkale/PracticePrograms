package com.collectionnew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("Id");
		l.add("Name");
		l.add("ClassName");
		l.add("tagName");
		l.add("LinkedText");
		l.add("PartialLinkedText");
		l.add("Xpath");
		l.add("CSS Selector");
	//	l.add(null);
		l.forEach(list->{
			System.out.println(list);
		});
		System.out.println("After sorting");
		
		Collections.sort(l);
		for(String s : l) {
			System.out.println(s);
		}
		System.out.println("After sorting");
		Iterator<String> li=l.iterator();
		while(li.hasNext()) {
			String str=li.next();
			System.out.println(str);
		}

	}

}
