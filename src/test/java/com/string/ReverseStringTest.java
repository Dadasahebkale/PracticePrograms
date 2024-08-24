package com.string;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseStringTest {
	@Test
	public void charAtFunction() {
		System.out.println("Reverse String with help of charAt and Length Method");
		String str="Welcome";
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	@Test
	public void convertingStringTocharArray() {
		System.out.println("Reverse String using toCharArray.....");
		String s="Selenium";
		String rev=" ";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
	}
	@Test
	public void getArrayTest() {
		System.out.println("=========================================");
		int a[]= {21,34,56,78,89,90,1,2,3};
		//System.out.println(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
