package com.apnacollege.fibo;

public class FibonoSeries {
	public static void getFibo(int a, int b,int num) {
		if(num==0) {
			return;
		}
		int c=a+b;
		System.out.println(c);
		getFibo(b,c,num-1);
	}

	public static void main(String[] args) {
//		int a=0;int b=1;
//		System.out.println(a);
//		System.out.println(b);
		int num=9;
		getFibo(0,1,num-2);
	}

}
