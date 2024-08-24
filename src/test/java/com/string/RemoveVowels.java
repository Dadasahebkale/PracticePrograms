package com.string;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String.......");
		String s=sc.nextLine();
		String str=s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				continue;
			
			}
			System.out.print(" "+s.charAt(i));
		}

	}

}
