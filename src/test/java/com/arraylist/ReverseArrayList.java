package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		String str="Welcome to java in QA world";
		String word[]=str.split(" ");
	
		ArrayList<String> arr=new ArrayList<String>(Arrays.asList(word));
		String rev="";
		for(int i=arr.size()-1;i>=0;i--) {
			rev=rev+arr.get(i)+" ";
			}
		System.out.println(rev);
		}
//		for(int i=0;i<arr.size();i++) {
//			rev=rev+arr.get(i)+" ";
//			String revW="";
//			for(int j=arr.size()-1;j>=0;j--) {
//				
//				revW=revW+arr.get(j);
//			}
//			rev=rev+revW;
//		}
//		System.out.println(rev);
//	}
}