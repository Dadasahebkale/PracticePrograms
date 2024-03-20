package com.simplejavaprograms;

public class BasicMathOperation {

	public static void main(String[] args) {
		getMultiplication(11, 17);
		getAddtion(134, 10);
		getDivision(21, 2);
		getSubstraction(2464, 616);
	}

	public static void getMultiplication(int a, int b) {

		int mult;
		mult = a * b;
		System.out.println("Multiplication of a and b is :" + mult);
	}

	public static void getAddtion(int a, int b) {
		int add;
		add = a + b;
		System.out.println("Addition of " + a + " and " + b + " is : " + add);

	}

	public static void getDivision(int a, int b) {
		float div;// data type integer, float, double
		div = (float) a / b;
		System.out.println("Division of " + a + " and " + b + " is : " + div);
	}

	public static void getSubstraction(int x, int y) {
		int sub;
		sub = x - y;
		System.out.println("Substraction of " + x + " and " + y + " is :" + sub);

	}

}
