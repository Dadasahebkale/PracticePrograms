package com.dk;

import java.util.stream.IntStream;

public class PrintNumWithoutLoop {

	public static void main(String[] args) {

		//IntStream.range(1, 101).forEach(s-> System.out.println(s));
		printNum(1);
	}
	public static void printNum(int num) {
	if(num<=100){
		System.out.println(num);
		num++;
		printNum(num);
	}	
	}

}
