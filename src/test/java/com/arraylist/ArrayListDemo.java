package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> movies=new ArrayList<String>();
		movies.add("Three Idiots");
		movies.add("DDL");
		movies.add("Tufan");
		movies.add("Tanaji");
		
		movies.forEach(shows ->{
			System.out.println(shows);
		});
		System.out.println("=====================================");
		Iterator<String> it=movies.iterator();
		while(it.hasNext()) {
			String mv=it.next();
			System.out.println(mv);
		}
		
		System.out.println("=====================================");
		
		ListIterator<String> mv=movies.listIterator(movies.size());
		while(mv.hasPrevious()) {
			String show=mv.previous();
			System.out.println(show);
		}
	}

}
