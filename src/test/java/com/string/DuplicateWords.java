package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		DuplicateWords d=new DuplicateWords();
		//d.getDuplicateWords();
		getDuplicateWords();
		getIterateWords();
		getList();
	}
	public static void getDuplicateWords() {
		String str="I am very happy to work as an automation tester and I like to find bugs in our life I am very happy to be good autoation tester";
		String [] words=str.split(" ");
		Set<String> setOfWords=new HashSet<String>();
		Set<String> duplicateWords=new HashSet<String>();
		for(String word : words) {
			if(setOfWords.add(word)==false) {
				duplicateWords.add(word);
			}
		}
		System.out.println(duplicateWords);


	}
	public static void getIterateWords() {
		ArrayList<String> books=new ArrayList<String>();
		books.add("Wings of fire");
		books.add("You can Wind");
		books.add("The power of subconsicious Mind");
		books.add("Personality plus");
		books.add("Who moved my cheese");
		
		Iterator<String> iterator=books.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			System.out.println(str);
		}
	}
	public static void getList() {
		ArrayList<String> ab=new ArrayList<String>();
		ab.add("Name");
		ab.add("TagName");
		ab.add("ID");
		ab.add("ClassName");
		ab.add("xpath");
		ab.add("CSS");
		ab.add("linkText");
		ab.add("PartialLinkText");
		
		ab.forEach(locator->{
			System.out.println(ab);
		});
	}

}
