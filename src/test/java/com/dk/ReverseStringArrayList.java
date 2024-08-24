package com.dk;

import java.util.ArrayList;

public class ReverseStringArrayList {

	public static void main(String[] args) {
		String str="Hello World";
		String w[]=str.split(" ");
		ArrayList<String> word=new ArrayList<String>();
		for(int i=w.length-1;i>=0;i--) {
			word.add(w[i]);
		}
		
		System.out.print(word);
	}

}
