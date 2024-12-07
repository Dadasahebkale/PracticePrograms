package com.streamjava;

import java.util.Arrays;
import java.util.List;

public class AverageOfArray {

	public static void main(String[] args) {
		AverageDemo();
		AverageOfArray.Demo();
	}
	public static void AverageDemo() {
		List<Integer> arr=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		double avg=arr.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Average is :"+avg);
	}
	public static void Demo() {
		List<Integer> list=Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		double av=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Aveage is :"+av);
	}

}
