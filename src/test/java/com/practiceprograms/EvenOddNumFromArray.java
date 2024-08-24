package com.practiceprograms;

import java.util.ArrayList;
import java.util.Collections;

public class EvenOddNumFromArray {

	public static void main(String[] args) {
	int[] myArray= {1,2,3,4,5,6,7,8,9,10,12,34,55,67,89,65,23};
	ArrayList<Integer> evenNum=new ArrayList<Integer>();
	ArrayList<Integer> oddNum=new ArrayList<Integer>();
	for(int i=0;i<myArray.length;i++) {
		if(myArray[i]%2==0) {
			evenNum.add(myArray[i]);
		}else {
			oddNum.add(myArray[i]);
		}
	}
	Collections.sort(evenNum);
	Collections.sort(oddNum);
	
	for(int e : evenNum)
		System.out.print(e+" ");
	for(int o : oddNum)
		System.out.print(o+" ");
	}
}
