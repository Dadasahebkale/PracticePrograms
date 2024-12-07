package com.dk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		String s="We are here to play around java";
		String words[]=s.split(" ");
		ArrayList<String> ss=new ArrayList<String>();
		for(int i=0;i<words.length;i++) {
			ss.add(words[i]);
			
	
			
		}
		ListIterator<String> l=ss.listIterator();
		while(l.hasPrevious()) {
		String sss=	l.previous();
		System.out.println(sss);
		}
		
			
		
	}

}
