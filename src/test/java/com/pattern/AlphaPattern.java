package com.pattern;

public class AlphaPattern {

	public static void main(String[] args) {
		int alph=65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alph)+" ");
				//alph++; // we will get alphabets
			}
			System.out.println();
			alph++;// we will increase 1 alphabet on the row
		}

	}

}
