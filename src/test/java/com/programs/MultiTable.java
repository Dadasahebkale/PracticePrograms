package com.programs;

public class MultiTable {
	final static int r=20;
	final static int  c=20;
	public static void main(String[] args) {
		int product[][]=new int[r][c];
	//	int row,col;
		System.out.println("Multiplication Table: ");
		System.out.println(" ");
		for(int i=10;i<r;i++) {
			for(int j=10;j<c;j++) {
				product[i][j]=i*j;
				System.out.print(" "+product[i][j]);
			}
			System.out.println(" ");
		}
		
	}

}
