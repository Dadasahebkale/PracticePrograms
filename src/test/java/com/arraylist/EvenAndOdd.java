package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class EvenAndOdd {

	public static void main(String[] args) {
		
		getArrayList();
		
	}
	
	public static void getArrayList() {
		
		int numbers[]= {1,2,3,5,6,7,8,11,12,13,17,19};
		ArrayList<Integer> evenList=new ArrayList<Integer>();
		ArrayList<Integer> oddList=new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				evenList.add(numbers[i]);
			}else {
				oddList.add(numbers[i]);
			}
		}
		Collections.sort(evenList);
		Collections.sort(oddList);
		for(int even :evenList) {
			System.out.print(even+ " ");
		}
		System.out.println();
		for(int odd : oddList) {
			System.out.print(odd+" ");
		}
	}

}
