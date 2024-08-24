package com.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConCatTwoArray {

	public static void main(String[] args) {
		String batters[]={"Rohit","Subhman","Shivam","Surya","Ravindra","Hardik","Rushbh"};
		String bowlers[]= {"Bumrah","Siraj","Kuldeep","Akshar"};
		Stream<String> bt=Arrays.stream(batters);
		Stream<String> bl=Arrays.stream(bowlers);
		String Team []=Stream.concat(bt, bl).toArray(s->new String[s]);
		for(String s : Team) {
			System.out.println(s);
		}
	}

}
