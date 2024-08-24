package com.string;

public class ReverseNumber {
	public static void main(String[] args) {
	rev(123);
	}
	
	public static void rev(int num) {
		if(num<10) {
			System.out.print(num);
			return;
		}else {
			System.out.print(num%10);
			rev(num/10);
		}
	}

}
