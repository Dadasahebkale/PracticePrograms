package com.increamentdecreament;

public class IncreamentDecreamentTest {

	public static void main(String[] args) {
		getIncreament();

	}
	public static void getIncreament() {
		int a=10;
		int b=a++;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		int c=10;
		int d=++c;
		System.out.println("c : "+c);
		System.out.println("d : "+d);
	}

}
