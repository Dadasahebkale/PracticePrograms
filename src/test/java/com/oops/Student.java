package com.oops;

class Opps{
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name, int age) {
		System.out.println(name+" : "+age);
	}
}
public class Student {
	public static void main(String[] args) {
	
		Opps o=new Opps();
		o.name="dada";
		o.age=14;
		o.printInfo(o.age+" : "+o.name);
	}
	
	
	

}
