package com.statickeyword;

public class StaticEmployee {
	int empId;
	String name;
	static String compName="Google";
	StaticEmployee(int empId, String name){
		this.empId=empId;
		this.name=name;
		//this.compName=compName;
	}
	public void display() {
		System.out.println(empId+" : "+name+" : "+compName);
	}
	public static void main(String[] args) {
		StaticEmployee e=new StaticEmployee(101,"Ganesh");
		StaticEmployee e1=new StaticEmployee(102,"Oviya");
		e.display();
		e1.display();
	}

}
