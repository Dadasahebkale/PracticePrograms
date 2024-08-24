package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Student{
	String sname;
	int id;
	char grade;
	public Student(String sname,int id, char grade) {
		this.sname=sname;
		this.id=id;
		this.grade=grade;
	}
}
public class FlatMapTest {
	public static void main(String[] args) {
		List<Student> studentList1=new ArrayList<Student>();
		studentList1.add(new Student("Amit",101,'A'));
		studentList1.add(new Student("John",102,'B'));
		studentList1.add(new Student("Surya",103,'C'));
		List<Student> studentList2=new ArrayList<Student>();
		studentList2.add(new Student("Ganesh",104,'A'));
		studentList2.add(new Student("Oviya",105,'B'));
		studentList2.add(new Student("Pranav",106,'C'));
		List<List<Student>> studentList=Arrays.asList(studentList1,studentList2);
		for(List<Student> s: studentList) {// before java8
			for(Student st : s) {
				System.out.print(st.id+" ");
			}
		}
		List<String> names=studentList.stream().flatMap(s->s.stream()).map(s->s.sname).collect(Collectors.toList());
		System.out.println("\n"+names);
	}
}
