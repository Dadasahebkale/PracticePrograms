package com.array;

import java.util.HashSet;
import java.util.Set;

public class CommonElement {

	public static void main(String[] args) {
		String[] arr1= {"Java", "Selenium", "Interview", "Questions","and", "Answers"};
		String[] arr2= {"API", "Testing", "Interview", "Prepations","and", "mindsets"};
		Set<String> common=new HashSet<String>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					common.add(arr1[i]);
					break;
				}
			}
		}
		for(String s : common)
		System.out.println(s);
	}

}
