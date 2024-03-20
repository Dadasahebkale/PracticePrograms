package com.apnacollege.fibo;

public class CalculateNPowerEvenOdd {

	public static int calPower(int x,int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		//for even number
		if(n%2==0) {
		 return calPower(x,n/2) * calPower(x,n/2);
		}//odd number
		else {
			return calPower(x,n/2) * calPower(x,n/2)*x;
		}
	}
	public static void main(String[] args) {
		System.out.println(calPower(2, 5));

	}

}
