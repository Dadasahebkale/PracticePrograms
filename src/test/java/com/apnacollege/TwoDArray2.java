package com.apnacollege;

import java.util.Scanner;

public class TwoDArray2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		//two d array declarations
		int [][]numbers=new int[rows][cols];
		//input rows
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		//outpu
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
