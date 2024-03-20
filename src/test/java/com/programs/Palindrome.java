package com.programs;

public class Palindrome {

	public static void main(String[] args) {
		isPalidrome(1911);

	}

	public static void isPalidrome(int num) {
		System.out.println("given number is " + num);
		int r = 0;
		int sum = 0;
		int t;
		t = num;
		while (num > 0) {

			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;

		}
		if (t == sum) {
			System.out.println("Palindrome number ");
		} else {
			System.out.println("not Palindrome");
		}
	}
}
