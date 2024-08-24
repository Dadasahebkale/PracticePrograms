package com.string;

import org.testng.annotations.Test;

public class RevEachWord {
	@Test
	public void revWord() {
		String s="Welcome to the java world";
		String words[]=s.split(" ");
		String rev=" ";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWords=" ";
			for(int j=word.length()-1;j>=0;j--) {
				revWords=revWords+word.charAt(j);
			}
			rev=rev+revWords;
		}
		System.out.println(rev);
	}
	@Test
	public void getReverse() {
		String str="Welcome to java";
		String[] words=str.split("\\s");
		String rev="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWords="";
			for(int j=word.length()-1;j>=0;j--) {
				revWords=revWords+word.charAt(j);
			}
			rev=rev+revWords+" ";
		}
		System.out.println(rev);
	}
	@Test
	public void getRev() {
		String str="Dadasaheb Kale";
		String[] words=str.split("\\s");
		String rev="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWords="";
			for(int j=word.length()-1;j>=0;j--) {
				revWords=revWords+word.charAt(j);
			}
			rev=rev+revWords+" ";
		}
		System.out.println(rev);
	}
	@Test
	public void getrevTest() {
		String str="Welcome to New era of dk careers";
		String[] words=str.split("\\s");
		String rev="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWords="";
			for(int j=word.length()-1;j>=0;j--) {
				revWords=revWords+word.charAt(j);
			}
			rev=rev+revWords+" ";
		}
		System.out.println(rev);
	}
	@Test
	public void RevTest() {
		String str="Ganesh Dadasahe Kale";
		String [] words=str.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWords="";
			for(int j=word.length()-1;j>=0;j--) {
				revWords=revWords+word.charAt(j);
			}
			rev=rev+revWords+" ";
		}
		System.out.println(rev);
	}

}
