package com.collection.set;

import java.util.HashSet;

public class UnionInsDiff {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		System.out.println(set);//[1, 2, 3, 4, 5, 6]
		HashSet<Integer> newSet=new HashSet<Integer>();
		newSet.add(3);
		newSet.add(4);
		newSet.add(5);
		System.out.println(newSet);//[3, 4, 5]
		newSet.addAll(set);
		System.out.println(set);//[1, 2, 3, 4, 5, 6]
		
		// insertion common Element
		set.retainAll(newSet);
		System.out.println("After insertion elements : "+set);//[1, 2, 3, 4, 5, 6]
		// difference
		set.removeAll(set);
		System.out.println(set);//[]
	}

}
