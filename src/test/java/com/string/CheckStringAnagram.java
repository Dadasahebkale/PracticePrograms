package com.string;

import java.util.Arrays;

public class CheckStringAnagram {

	public static void main(String[] args) {
		//Two strings are said to be anagram if we can form one string by arranging the characters of another string
		String s="Race";
		String s1="Care";
		char[] arr1=s.toLowerCase().toCharArray();
		char[] arr2=s1.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Given string is anagram");
		}else {
			System.out.println("Given string in not anagram");
		}

	}

}
