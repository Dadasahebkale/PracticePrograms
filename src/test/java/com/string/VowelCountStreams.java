package com.string;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

public class VowelCountStreams {

	public static void main(String[] args) {
		IntPredicate p=new IntPredicate() {
			
			@Override
			public boolean test(int t) {
				// TODO Auto-generated method stub
				return t=='a'||t=='e'||t=='i'||t=='u'||t=='o';
			}
		};
		String test="Automation";
		
		long count =test.toLowerCase().chars().filter(p).count();
		System.out.println(count);
	
		//using google guava
		String st="Aeiou";
		int vCount=CharMatcher.anyOf("aeiou").countIn(st.toLowerCase());
		int cCount=CharMatcher.noneOf("auoie").countIn(st.toLowerCase());
		System.out.println(vCount);
		System.out.println(cCount);
	}

}
