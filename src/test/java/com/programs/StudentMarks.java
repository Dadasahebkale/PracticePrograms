package com.programs;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student name");
		String name=s.nextLine();
		System.out.println("Enter the Students marks :");
		int[] marks=new int[5];
		for(int i=0;i<5;i++) {
			marks[i]=s.nextInt();
		}
		int totalMarks=0;
		for(int mark :marks) {
			totalMarks+=mark;
		}
		double per=(totalMarks*100.0)/500.0;
		System.out.println("Student name "+name);
		System.out.println("Total Marks "+totalMarks);
		System.out.println("Percentage "+per+" %");
		
		String grade;
		if(per>=90) {
		grade="A";	
		}else if(per>=80) {
			grade="B";
		}else if(per>=70) {
			grade="C";
		}else if(per>=60) {
			grade="D";
		}else {
			grade="F";
		}
		System.out.println("Grade: "+grade);
	}

}
