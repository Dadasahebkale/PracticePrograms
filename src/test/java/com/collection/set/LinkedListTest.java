/**
 * 
 */
package com.collection.set;

import java.util.LinkedList;

/**
 * 
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Duplicate not allowed
		//Insertion order preserved
		//HashTable-LinkedList
		LinkedList l=new LinkedList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		System.out.println(l);//[100, 200, 300, 400, 500, 600]
	}

}
