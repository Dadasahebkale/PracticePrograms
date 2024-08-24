package com.switchcase;

import java.util.Scanner;

public class SelectDay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose your day ");
		int day=sc.nextInt();
		
				switch(day) {
				case 0: System.out.println("Sunday");
				break;
				case 1: System.out.println("Monday");
				break;
				case 2: System.out.println("Tuesday");
				break;
				case 3: System.out.println("Wednsday");
				break;
				case 4: System.out.println("Thursday");
				break;
				case 5: System.out.println("Friday");
				break;
				case 6: System.out.println("Saturday");
				break;
				default: System.out.println("Invalid Selection");
				
				}
				sc.close();
	}

}
