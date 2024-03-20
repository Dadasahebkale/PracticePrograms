package com.programs;

public class FeboSeries {

	public static void main(String[] args) {
		getFebo(10);
	}
	public static void getFebo(int count) {
		System.out.println("Given num upto "+count);
		int a=0;
		int b=1;
		int c=1;
		for(int i=1;i<=count;i++) {
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}
		
	}

}
