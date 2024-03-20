package com.apnacollege.fibo;

public class CalculatePower {

	public static int calPower(int x, int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		int xpower=calPower(x,n-1);
		int xp=xpower*x;
		return xp;
	}
	public static void main(String[] args) {
		System.out.println(calPower(2, 5));

	}

}
