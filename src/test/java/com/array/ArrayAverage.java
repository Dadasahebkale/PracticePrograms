package com.array;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;
import com.google.common.math.Stats;

public class ArrayAverage {
/*WAP program to calculate average of arrays using
 * simple loop
 * java 8 stream
 * google guava library
 * 
 * */
	
	public static void main(String[] args) {
		//using simple for loop
		int num[]= {1,2,3,4,5,6,7,8,9,10};
		double total=0;
		for(double e :num) {
			total=total+e;
		}
		System.out.println("Average is "+(total/num.length));
		
		//using java streams
		OptionalDouble avg=Arrays.stream(num).average();
		System.out.println("Average is "+avg.getAsDouble());
		
		//using google guava
		double avg1=Stats.meanOf(num);
		System.out.println(avg1);
	}

}
