package com.string;

import java.util.Scanner;

public class ReverseEachWordTest {

	public static void main(String[] args) {
		
		reversewords();
	}
	public static void reversewords() {
		try {
		System.out.println("Enter the String \n");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String words[]=s.split(" ");
		String rev=" ";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWord=" ";
			for(int j=word.length()-1;j>=0;j--) {
				revWord=revWord+word.charAt(j);
			}
			rev=rev+revWord;
		}
		System.out.println(rev);
		sc.close();
	}
	catch(Exception e) {
	System.out.println("Exception occuring.....");	
	e.printStackTrace();
	}
		
	
	}
	
}
