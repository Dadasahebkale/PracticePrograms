package com.switchcase;

import java.util.Scanner;

public class SwitchTest {
	
	public static void checkSwitchCase() {
		System.out.println("Enter Switch button");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch (num) {
		case 1: 
			
			System.out.println("Namste");
			break;
		case 2:
			System.out.println("Hello");
		break;
		
		case 3:
			System.out.println("Bonjure");
			break;
		default :
			System.out.println("Incorrect number has been entered");
		}
	}
	public static void ifCaseTest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please press the button");
		int button=sc.nextInt();
		if(button==1) {
			System.out.println("Namaste");
		}else if(button==2) {
			System.out.println("Hello");
		}else {
			System.out.println("Bojure");
		}
	}
	public static void checkGreaterNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int num=0;
		if(a>b) {
			System.out.println("A is greater ");
		}
			else if(b>a) {
				System.out.println("B is greater");
			}
			else {
				System.out.println("Equal");
			}
				
		switch(num) {
		case 1:
			
			System.out.println("A is greater than b");
			
			break;
		case 2:
			System.out.println("B is greater than a");
			break;
		case 3:
			System.out.println("Both are equal");
			break;
		default :
			System.out.println("You have pressed incorrect number");
		}
		
		
		
	}
	public static void main(String[] args) {
		ifCaseTest();
		checkSwitchCase();
		checkGreaterNum();
	}
}
