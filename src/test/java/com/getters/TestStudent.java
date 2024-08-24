package com.getters;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		Student s1=new Student("Ganesh", 1, 90, 15);
		Student s2=new Student("Oviya", 2, 93, 13);
		Student s3=new Student("Pranavi", 1, 70, 13);
		Student s4=new Student("Pranav", 1, 77, 12);
		Student s5=new Student("Dada", 1, 98, 43);
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		System.out.println("Total Student "+studentList.size());
		for(Student s : studentList) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("=============using streams============================");
		//using streams
		studentList.stream().forEach(s->System.out.println(s));
		System.out.println();
		System.out.println("=============name where marks >80============================");
		
		studentList.stream().filter(e-> e.getMarks()>80)
			.forEach(e->System.out.println(e.getName()+" : "+e.getMarks()));
		
		System.out.println();
		System.out.println("=============highest marks============================");
		
		int hm= studentList.stream().map(e->e.getMarks()).max(Integer::compare).get();
		System.out.println("Highest marks "+hm);
		
		studentList.stream().filter(e->e.getMarks()==hm).forEach(e->System.out.println(e));
		}
	
}
