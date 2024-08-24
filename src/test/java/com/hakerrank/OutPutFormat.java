package com.hakerrank;

import java.util.Scanner;

public class OutPutFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("==========================================");
		for(int i=0;i<3;i++) {
			String s=sc.next();
			int x=sc.nextInt();
			System.out.printf("%-10s %03d\n",s,x);
		}
		
		System.out.println("==========================================");
		sc.close();
	}
	
}
