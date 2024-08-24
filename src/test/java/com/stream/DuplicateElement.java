package com.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {
		String data[]= {"Selenium","Java","Azure","TestNg","Selenium","Java"};
		Set<String> dataSet=new HashSet<String>();
		Set<String> dupSet=Arrays.asList(data)
				.stream().filter(e->!dataSet.add(e))
				.collect(Collectors.toSet());
		//System.out.println(dupSet);
//		DupData();
//		uniqueData();
//		uniqueEle();
	getCol();
	}
	public static void DupData() {
		String data[]= {"Selenium","Java","Azure","TestNg","Selenium","Java"};
		Set<String> dataSet=new HashSet<String>();
		Set<String> dupSet=Arrays.asList(data)
				.stream().filter(e->!dataSet.add(e))//.forEach(e->System.out.println(e));
				.collect(Collectors.toSet());
		System.out.println(dataSet);
	
	}
	
	public static void uniqueData() {
		String data[]={"Test","BeforeTest","BeforeTest","BeforeTest","AfterTest","BeforeMethod","AfterMethod","BeforeClass","AfterClass"};
		Set<String> dataSet=new HashSet<String>();
		Set<String> dupSet=Arrays.asList(data).stream().filter(e->!dataSet.add(e))
				.collect(Collectors.toSet());
		System.out.println(dupSet);
	}
	public static void uniqueEle() {
		String data="Java is world wide programing langauage java is powerful langauage";
		String words[]=data.toLowerCase().split("\\s");
		Set<String> dataSet=new HashSet<String>();
		Set<String> dupSet=Arrays.asList(words)
				.stream().filter(s->!dataSet.add(s)).collect(Collectors.toSet());
		System.out.println(dupSet);
	}
	public static void getCol() {
		String data="Java is world wide programing langauage java is powerful langauage";
		String words[]=data.toLowerCase().split("\\s");
		Set<String> l=new HashSet<String>();
		for(String s : words) {
			if(l.add(s)==true) {
				System.out.println(s);
			}
		}
	}
}
