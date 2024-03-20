package com.practiceprograms;

import java.util.ArrayList;
import java.util.Collections;

public class EvenOddNumFromArray {

	public static void main(String[] args) {
	int[] myArray= {1,2,3,4,5,6,7,8,9,11,23,45,67,89,77,12};
	ArrayList<Integer> evenList=new ArrayList<Integer>();
	ArrayList<Integer> oddList=new ArrayList<Integer>();
	for(int i=0;i<myArray.length;i++) {
		if(myArray[i]%2==0) {
			evenList.add(myArray[i]);
		}else {
			oddList.add(myArray[i]);
		}
	}
	Collections.sort(evenList);
	Collections.sort(oddList);
	
	for(int e : evenList)
		System.out.print(e+" ");
	for(int o : oddList)
		System.out.print(o+" ");
	}
}
