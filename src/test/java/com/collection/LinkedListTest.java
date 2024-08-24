package com.collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("x");
		l.add("y");
		l.add("z");
		l.add("a");
		l.add("b");
		l.add("c");
		LinkedList newList=new LinkedList();
		newList.addAll(l);
		System.out.println(newList);//[x, y, z, a, b, c]
		newList.removeAll(l);
		System.out.println(newList);//[]
		System.out.println("Before sorting..");
		Collections.sort(l);
		System.out.println(l);//[a, b, c, x, y, z]
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);//[z, y, x, c, b, a]
		//suffle element
		Collections.shuffle(l);
		System.out.println("After suffling..."+l);//[x, b, c, z, a, y]

	}

}
