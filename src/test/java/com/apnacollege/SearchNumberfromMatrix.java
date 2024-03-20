package com.apnacollege;

import java.util.Scanner;

public class SearchNumberfromMatrix {

	public static void main(String[] args) {

		//findNumberinTable(5);
		findNumber();
	}
	public static void findNumberinTable(int x) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and cols");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int [][] numbers=new int[rows][cols];
		
		//input arrays
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		//output array
		x=sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(numbers[i][j]==x) {
					System.out.println("X is found on the location of ("+i+", "+j+")");
				}
			}
		}
	}
	
	public static void findNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and colmns :\n");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int [][] numbers=new int[rows][cols];
		//input rows and cols
		System.out.println("Input the rows and cols");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter search number \n");
		int x=sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(numbers[i][j]==x) {
					System.out.println("The location of x is ("+i+","+j+")");
				}
			}
		}
	}

}
