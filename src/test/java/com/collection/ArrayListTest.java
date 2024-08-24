package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.addLast("dada");
		al.add("Ganesh");
		al.add("Oviya");
		al.add("pranav");
		al.add("Dada");
//		al.add(12);
//		al.add(13);
//		al.add(14);
//		al.add(15);
		al.add(2, "Dadasaheb");
		System.out.println(al.contains("Oviya"));
		al.addFirst("Temp");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Java");
		al2.add("Selenium");
		al2.add("TestNG");
		al2.add("Maven");
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	
	}

}
