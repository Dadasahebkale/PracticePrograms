package com.stream;

public class StringNumbers {

	public static void main(String[] args) {
		String str="Attitude";
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		for(char c: ch) {
			int temp=(int)c;
			int t=96;
			if(temp<=122 & temp>=97) {
				System.out.println(temp-t);
			}
		}

	}

}
