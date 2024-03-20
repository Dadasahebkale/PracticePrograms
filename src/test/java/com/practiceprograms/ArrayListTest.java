package com.practiceprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		getArrayList();

	}
	public static void getArrayList() {
		ArrayList<String> lists=new ArrayList<String>();
		lists.add("BeforeSuite");
		lists.add("BeforeClass");
		lists.add("BeforeMethod");
		lists.add("BeforeTest");
		lists.add("Test");
		lists.add("AfterTest");
		lists.add("AfterMethod");
		lists.add("AfterClass");
		lists.add("aftersuite");
		
//		lists.forEach(l->{System.out.println(l);
//		});
		Iterator<String> it=lists.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
	}
	

}
