package com.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Employee{
	int empId;
	String name;
	double salary;	
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
}
public class FilterMap {
	public static void main(String[] args) {
	List<Employee> empList=Arrays.asList(new Employee(101,"Alex",10000),
				new Employee(102,"Ganesh",20000),
				new Employee(103,"Oviya",25000),
				new Employee(104,"Pranavi",35000),
				new Employee(105,"Dadasaheb",40000)
				);
	List<Double> empSalary=empList.stream()
			.filter(e->e.salary>=25000)
			.map(e->e.salary)
			.collect(Collectors.toList());
	System.out.println(empSalary);
	}
}
