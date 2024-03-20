package com.practiceprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {
	
		String str="Method overloading means same method name having different argument of parameter";
		ArrayList<String> words=new ArrayList<String>(Arrays.asList(str.split(" ")));
		System.out.println(words);
	}

}
