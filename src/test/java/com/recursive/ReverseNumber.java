package com.recursive;

public class ReverseNumber {
	public static void main(String[] args) {
	rev(123);
	rev(100);
	rev(001);
	rev(12345);
	rev(1);
	}
	
	public static void rev(int num) {
		if(num<10) {
			System.out.println(num);
			return;
		}else {
			System.out.print(num%10);
			rev(num/10);
		}
	}

}
