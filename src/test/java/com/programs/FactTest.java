package com.programs;

public class FactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calfact(5));
		System.out.println(getFact(5));
		System.out.println(getFact(4));
		System.out.println(getFact(2));
	}
	public static int calfact(int num) {
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	public static int getFact(int num) {
		if(num==0)
			return 1;
		else
			return(num*getFact(num-1));
	}
	

}
