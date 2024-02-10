package com.programs;

import org.testng.annotations.Test;

public class JavaMultiplePrograms {

	private static final int priority = 0;
	@Test(priority=1)
	public void ReverseString() {
		
		String str="dadasahebkale";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
@Test(priority=2)
public void swapTwoString() {
	
	String str1="Dadasaheb";
	String str2="Kale";
	System.out.println("Before swapping the 1st string "+str1+"\nBefore Swapping Second String "+str2);
	
	str1=str1+str2;
	str2=str1.substring(0,str1.length()-str2.length());
	str1=str1.substring(str2.length());
	
	System.out.println("After swapping the 1st string "+str1+"\nAfter Swapping Second String "+str2);
	upToHundred(1);
}
//@Test(priority=3)
public static void upToHundred(int num) {
	

	if(num<=100) {
		
		System.out.println(num);
		num++;
		upToHundred(num);
	}
	//System.out.println(num);
}
}
