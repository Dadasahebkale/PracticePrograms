package com.getters;

public class Student {
	private String name;
	private int RollNum;
	private int Marks;
	private int Age;
	
	public String getName() {
		return name;
	}
	
	public int getRollNum() {
		return RollNum;
	}
	
	public int getMarks() {
		return Marks;
	}
	
	public int getAge() {
		return Age;
	}

	public Student(String name, int rollNum, int marks, int age) {
		this.name = name;
		this.RollNum = rollNum;
		this.Marks = marks;
		this.Age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", RollNum=" + RollNum + ", Marks=" + Marks + ", Age=" + Age + "]";
	}
	
	
	

}
