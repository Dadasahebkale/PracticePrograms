package com.statickeyword;

public class Employee {
	int empId;
	String name;
	String compName;
	Employee(int empId, String name, String compName){
		this.empId=empId;
		this.name=name;
		this.compName=compName;
	}
	public void display() {
		System.out.println(empId+" : "+name+" : "+compName);
	}
	public static void main(String[] args) {
		Employee e=new Employee(101,"Ganesh","Apple");
		Employee e1=new Employee(102,"Oviya","Google");
		e.display();
		e1.display();
	}

}
