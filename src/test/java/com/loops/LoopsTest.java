package com.loops;

public class LoopsTest {

	public static void main(String[] args) {
		getForLoop(10);
		whileLoop(10);
		getDoWhileLoop(12);
	}
	public static void getForLoop(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
	}
	public static void whileLoop(int num) {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	public static void getDoWhileLoop(int num) {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}

}
