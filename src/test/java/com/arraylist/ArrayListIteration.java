package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		getArrayList();

	}
	public static void getArrayList() {
		ArrayList<String> tvSeries=new ArrayList<String>();
		tvSeries.add("Games of Throns");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big bang theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		System.out.println("1]========Print using for each and lambda =============");
		tvSeries.forEach(shows->{
			System.out.println(shows);
		});
		System.out.println("2]=======Print using for iterator and while loop=============");
		
		Iterator<String> tv=tvSeries.iterator();
		while(tv.hasNext()) {
			String shows=tv.next();
			System.out.println(shows);
		}
		System.out.println("3]=======Print using forEachRemaining and Lambda=============");
		tv=tvSeries.iterator();
		tv.forEachRemaining(show->{
			System.out.println(show);
		});
		System.out.println("4]=======Print using for each loop=============");
		for(String shows :tvSeries) {
			System.out.println(shows);
		}
		System.out.println("5]=======Print using for loop with index/order=============>");
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		System.out.println("6]=======Print using a ListIterator to traverse in both direction=============>");
		ListIterator<String> tvSeriesListIterator=tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String show=tvSeriesListIterator.previous();
			System.out.println(show);
		}
	}
	

}
