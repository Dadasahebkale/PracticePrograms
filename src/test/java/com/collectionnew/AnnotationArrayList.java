package com.collectionnew;

import java.util.ArrayList;
import java.util.ListIterator;

public class AnnotationArrayList {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("BeforeSuite");
		a.add("BeforeTest");
		a.add("BeforeClass");
		a.add("BefoeMethod");
		a.add("Test");
		a.add("AfterMethod");
		a.add("AfterClass");
		a.add("AfterTest");
		a.add("AfterSuite");
		
		a.forEach(s->{
			System.out.println(s);
		});
		System.out.println("===============================================");
		ListIterator<String> le=a.listIterator(a.size());
		while(le.hasPrevious()) {
			String ss=le.previous();
			System.out.println(ss);
		}
		System.out.println("===============================================");
		ListIterator<String> s=a.listIterator(a.size());
		while(s.hasPrevious()) {
			String ss=s.previous();
			System.out.println(ss);
		}
		
	}

}
