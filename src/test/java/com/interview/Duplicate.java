package com.interview;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		String names[]= {"Automation","Java","C++","JavaScript","Python","Java"};
		Set<String> stores=new HashSet<String>();
		for(String name :names) {
			if(stores.add(name)==false) {
				System.out.println("Duplicate element is :: "+name);
			}
		}
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate the value is "+names[i]);
				}
			}
		}
		
	}

}
