package com.streamjava;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {
		
		squareAvg();
		getSquare();
		getSqr();
		square();
	}
	public static void squareAvg() {
		List<Integer> list=Arrays.asList(1,10,20,30,15);
		double ave=list.stream().map(e->e*e).mapToInt(e->e).average().getAsDouble();
		System.out.println("Average is : "+ave);
	}
	public static void getSquare() {
		List<Integer> list=Arrays.asList(1,10,20,30,15);
		double average=list.stream().map(e->e*e).filter(e->e>100)
			.mapToInt(e->e).average().getAsDouble();
		System.out.println("Average is :"+average);
	}
	public static void getSqr() {
		List<Integer> list=Arrays.asList(1,10,20,30,40,50);
		double sqr=list.stream().map(e->e*e)
				.filter(e->e>100)
				.filter(e->e<2100)
				.mapToInt(e->e).average().getAsDouble();
		System.out.println("Average is :"+sqr);
	}
	public static void square() {
		List<Integer> list=Arrays.asList(1,11,12,13,14,15);
		double k=list.stream().map(e->e*e)
					.filter(e->e>100)
					.mapToInt(e->e).average().getAsDouble();
		System.out.println(k);
	}

}
