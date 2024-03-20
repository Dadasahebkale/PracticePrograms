package com.programs;

import java.io.StringBufferInputStream;
import java.util.stream.IntStream;

public class PrintNumbers {

	public static void main(String[] args) {
		//printNum(1);
		//printNumber(50,100);
		IntStream.range(1, 11).forEach(e-> System.out.println(e));
		IntStream.range(11, 21).forEach(e->System.out.println(e));
//		StringStream str=StringStream.of("one","two","three","four");//.forEach(e-> System.out.println(str));
	}
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	public static void printNumber(int stNum,int endNum) {
		if(stNum<=endNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, endNum);
		}
	}

}
