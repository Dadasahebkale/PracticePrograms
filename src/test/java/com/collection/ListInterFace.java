package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterFace {

	public static void main(String[] args) {
		getList();
		getDuplicateWords();

	}
	public static void getList() {
		List<String> allList=new ArrayList<String>();
		allList.add("Java");
		allList.add("Database");
		allList.add("ArrayList");
		allList.add("LinkedList");
		allList.add("Selenium");
		allList.add("HashSet");
		allList.add("HashMap");
		//System.out.println(allList.get(3));
		for(String list:allList) {
			System.out.println(list);
		}
	}
	public static void getDuplicateWords() {
		System.out.println("All words :");
		String str="the compulsory contribution to state revenue, levied by the government on workers income and business profits or added to the cost of some goods services and transactions we are study compulsory all java concepts";
		String[] words=str.split(" ");
		List<String> allwords=new ArrayList<String>();
		//List<String> dupwords=new ArrayList<String>();
		StringBuffer sb=new StringBuffer();
		sb.reverse().append(words);
		String s=words.toString();
		System.out.println(sb.reverse().append(words));
		for(String word :words) {
			
		
			System.out.print(word+" ||");
		}
		
	}
}
