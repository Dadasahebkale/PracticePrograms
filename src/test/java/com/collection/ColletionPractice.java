package com.collection;

import java.util.ArrayList;

public class ColletionPractice {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("C");
		l.add("B");
		l.add("F");
		l.add("E");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "K");
		System.out.println(l);
	}

}
