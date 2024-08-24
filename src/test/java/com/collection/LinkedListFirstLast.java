package com.collection;

import java.util.LinkedList;

public class LinkedListFirstLast {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Dog");
		l.add("Dog");
		l.add("Cat");
		l.add("Goat");
		l.add("Sheep");
		System.out.println(l);//[Dog, Dog, Cat, Goat, Sheep]
		l.addFirst("Tiger");
		l.addLast("Lion");
		System.out.println(l.getFirst());//Tiger
		
		System.out.println(l.getLast());//Lion
		
		l.removeFirst();
		System.out.println(l);//Dog, Dog, Cat, Goat, Sheep, Lion]
		l.removeLast();
		System.out.println(l);//[Dog, Dog, Cat, Goat, Sheep]
	}

}
