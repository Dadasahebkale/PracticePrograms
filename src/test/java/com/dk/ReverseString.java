package com.dk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		String s="We are here to play around java";
		//String words[]=s.split(" ");
		ArrayList<String> ss=new ArrayList<String>(Arrays.asList(s.split(" ")));
		ListIterator<String> l=ss.listIterator();
		while(l.hasPrevious()) {
			String k=l.previous();
			System.out.println(k);
		}
		
	}

}
