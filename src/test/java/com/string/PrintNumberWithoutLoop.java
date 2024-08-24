package com.string;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumberWithoutLoop {
//print number from 0 to 100 using arrays and fill method
	public static void main(String[] args) {
		
		//1 Arrays fill
		Object num[]=new Object[100];
		Arrays.fill(num,new Object() {
			int count=0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(num));
		System.out.println();
		
		System.out.println("====================================");
		
		System.out.println("Using bit set");
		//BitSet
		String set= new BitSet() {{set(1,101);}}.toString();
		System.out.append(set,1,set.length());
		System.out.println();
		
		System.out.println("====================================");
		BitSet bs = new BitSet(100);
		bs.set(1,101);
		System.out.println(bs);
	}

}
