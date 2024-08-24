package com.string;

import java.util.Arrays;

public class ReverseCharacter {

	public static void main(String[] args) {
		String str="DadasahebKale";
	
		char ch[]=str.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++) {
			Arrays.sort(ch);
			
		}
		System.out.println(ch);

	}

}
