package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class CopyOneSetToAnother {

	public static void main(String[] args) {
		Set even=new HashSet();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		even.add(12);
		
		Set num=new HashSet();
		num.add(14);
		num.addAll(even);
		System.out.println(num);
	}

}
