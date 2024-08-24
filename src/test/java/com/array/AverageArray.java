package com.array;

public class AverageArray {

	public static void main(String[] args) {
		System.out.println(calAverage());

	}
	public static int calAverage() {
		int num[]= {1,2,3,4,5,6,7,7,8};
		int total=0;
		for(int e: num) {
			total=total+e;
		}
		return (total/num.length);
	}
	

}
