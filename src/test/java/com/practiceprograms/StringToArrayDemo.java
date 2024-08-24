package com.practiceprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class StringToArrayDemo {

	public static void main(String[] args) {
		String str="ID Name ClassName TagName xpath cssSelector linkText partialLinkText";
		
		ArrayList<String> l=new ArrayList<String>(Arrays.asList(str.split(" ")));
		System.out.println("<=====Array Print================>");
		System.out.println(l);
		System.out.println("<=========Iterator===========>");
		Iterator<String> ss=l.iterator();
		while(ss.hasNext()) {
			String s=ss.next();
			System.out.println(s);
		}
		System.out.println("<=============ListIterator==============>");
		ListIterator<String> li=l.listIterator(l.size());
		while(li.hasPrevious()) {
			String st=li.previous();
			System.out.println(st);
		}
		
		System.out.println("<==========for each loop=================>");
		for(String s : l) {
			System.out.println(s);
		}
		System.out.println("<============forEach===============>");
		
		l.forEach(s->{
			System.out.println(s);
		});

	}

}
