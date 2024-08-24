package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;

public class ConCatTwoArray {

	public static void main(String[] args) {
		String batter[]={"Rohit","Virat","Shivam","Rishbha","Surya"};
		String alrdr[]= {"Hardik","Jadeja"};
		String bollers[]={"Burah","Siraj","Kuldeep","Chahal"};
		String str[]=mergeArray(batter, alrdr, bollers);
//		ArrayList<String> s=new ArrayList<String>();
//		for(String ss: str) {
		System.out.println(Arrays.toString(str));
		//}
	
		
	}
	
	public static String[] mergeArray(String []array1,String []array2,String[] array3) {
		int l1=array1.length;
		int l2=array2.length;
		int l3=array3.length;
		String[] merge=new String[l1+l2+l3];
		System.arraycopy(array1, 0, merge, 0, l1);
		System.arraycopy(array2, 0, merge, l1, l2);
		System.arraycopy(array3, 0, merge, l1+l2, l3);
		return merge;
	}
	
	

}
