package com.string;

public class RemoveSpecialSymbols {

	public static void main(String[] args) {
		
		String s="H!@#$%)*&&34ell700o";
		String l=s.replaceAll("[^a-zA-z]","");
		System.out.println(l);
		
		String q="akjl9dfs0fsd4dfs9sfasdf6fdsf5jhkj9kjh5hkjh0jkjhkh5";
		String w=q.replaceAll("[^0-9]", "");
		System.out.println(w);

	}

}
