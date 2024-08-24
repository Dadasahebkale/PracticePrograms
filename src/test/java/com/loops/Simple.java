package com.loops;

public class Simple {

	public static void main(String[] args) {
		//loop(1,10);
		System.out.println("*------*--------*-----------*-------*");
		//loop(11,20);
		System.out.println("*------*--------*-----------*-------*");
	//	loop(40,50);
		System.out.println("*------*--------*-----------*-------*");
		wloop(1,10);
		System.out.println("*------*--------*-----------*-------*");
		wloop(11,20);
		System.out.println("*------*--------*-----------*-------*");

	}
	public static void loop(int start, int stop) {
		for(;start<=stop;start++) {
			System.out.println(start);
		}
	}
	public static void wloop(int start, int stop) {
		
		while(start<=stop) {
			System.out.println(start);
			start++;
		}
		
	}

}
