package com.interview.java;

public class ComparisonInt {

	public static void main(String[] args) {
		Integer t1=100;
		Integer t2=100;
		System.out.println(t1==t2);//true
		// Integer caching/pool range is -128 to 127
		// Integer caching is applicable for literals
		
		Integer p1=200;
		Integer p2=200;
		
		System.out.println(p1==p2);//false
		Integer p3=127;
		Integer p4=127;
		
		System.out.println(p3==p4);//true
		
		Integer p5=128;
		Integer p6=128;
		
		System.out.println(p5==p6);//false
		
		Integer p7=new Integer(100);
		Integer p8=new Integer(100);
		
		System.out.println(p7==p8);//false
		
	}

}
