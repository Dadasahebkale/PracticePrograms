package com.string;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="Welcome to the automation world";
		String words[]=str.split(" ");
		String rev=" ";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWord=" ";
			for(int j=word.length()-1;j>=0;j--) {
				revWord=revWord+word.charAt(j);
			}
			rev=rev+revWord+" ";
		}
		System.out.println(rev);
	}

}
