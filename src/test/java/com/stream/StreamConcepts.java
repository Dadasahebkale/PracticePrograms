package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamConcepts {
	@Test(priority=1)
	public void FilterMarks() {
		/*
		 Collection->if we want to represent a group of object as a single entity then we should go for collection

			Stream->If we want to process objects from the collection-stream
		
		*/
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println(list);
		List<Integer> updatedList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(updatedList);
	}
	@Test(priority=2)
	public void UpdateMarkTest() {
		// collect method collect the results
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer> updatedMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
		// collect method collect the results
		System.out.println(updatedMarks);
	}
	@Test(priority=3)
	public void faileStudents() {
		//i want to find count of failed students then after filter 
		//i have directly use count method to get number of failed student
		// count method to get number of occurrences
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(80);
		marks.add(60);
		marks.add(20);
		marks.add(50);
		marks.add(30);
		marks.add(25);
		marks.add(70);
		System.out.println(marks);
		long failedStudents=marks.stream().filter(m->m<35).count();//count method to get number of occurrences
		System.out.println(failedStudents);	
	}
	@Test(priority=4)
	public void sortMarks() {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(80);
		marks.add(60);
		marks.add(20);
		marks.add(50);
		marks.add(30);
		marks.add(25);
		marks.add(70);
		System.out.println(marks);
		List<Integer> sortedMarks=marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedMarks);
	}
	@Test(priority=5)
	public void ComparatorMarks() {
		//sorted(Comparator)==> Customized sorting
		//Comparator-is functional interface

		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(80);
		marks.add(60);
		marks.add(20);
		marks.add(50);
		marks.add(30);
		marks.add(25);
		marks.add(70);
		System.out.println(marks);
		List<Integer> sortedMarks=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(sortedMarks);
	}
	@Test(priority=6)
	public void CompareToMethod() {
		// We can use achieve sorting using below 3 ways
		//sorted(CompareTo)==> I->(i1,i2)->i1.compareTo(i2)
		//					II->(i1,i2)->i2.compareTo(i1)
		//					III-> (i1,i2)->-i1.compareTo(i2)
		//					IV->(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0)
		//					V -> only use default .sorted()
		
		//Comparator-is functional interface

		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(80);
		marks.add(60);
		marks.add(20);
		marks.add(50);
		marks.add(30);
		marks.add(25);
		marks.add(70);
		System.out.println(marks);
		List<Integer> Ascending=marks.stream().sorted(((i1,i2)->i1.compareTo(i2))).collect(Collectors.toList());
		List<Integer> discending=marks.stream().sorted(((i1,i2)->-i1.compareTo(i2))).collect(Collectors.toList());
		System.out.println(Ascending);
		System.out.println(discending);
	}
	@Test(priority=7)
	public void SortingStringTest() {
		// We can use achieve sorting using below 3 ways
		//sorted(CompareTo)==> I->(i1,i2)->i1.compareTo(i2)
		//					II->(i1,i2)->i2.compareTo(i1)
		//					III-> (i1,i2)->-i1.compareTo(i2)
		//					IV->(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0)
		//					V -> only use default .sorted()
		
		//Comparator-is functional interface

		ArrayList<String>list=new ArrayList<String>();
		/*	1.(s1,s2)->s1.compareTo(s2)===>Natural sorting order
			2.(s1,s2)->s2.compareTo(s1)===>Reverse Natural sorting order
			3.(s1,s2)->-s1.compareTo(s2)===>Reverse Natural sorting order
		 * */
		list.add("Ganesh");
		list.add("Pranav");
		list.add("Oviya");
		list.add("Pranavi");
		list.add("MonuDada");
		list.add("Sanavi");
		list.add("Pooja");
		list.add("Anna");
		System.out.println(list);
		List<String> Ascending=list.stream().sorted(((i1,i2)->i1.compareTo(i2))).collect(Collectors.toList());
		List<String> discending=list.stream().sorted(((i1,i2)->-i1.compareTo(i2))).collect(Collectors.toList());
		List<String> naturalSorting=list.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order "+ "=========******========*******========"+"");
		System.out.println(Ascending);
		System.out.println("discending order "+ "=========******========*******========"+"");
		System.out.println(discending);
		System.out.println("withoutArgument order "+ "=========******========*******========"+"");
		System.out.println(naturalSorting);
		System.out.println(Ascending==naturalSorting);
	}
	@Test(priority=8)
	public void increasingLength() {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Rohit Sharma");
		list.add("Virat Kohli");
		list.add("Bumrah");
		list.add("Ravindra Jadeja");
		list.add("KL Rahul");
		list.add("Shereyas Iyeer");
		list.add("Rinku Singh");
		list.add("Shubham Dube");
		System.out.println(list);
		Comparator<String> c=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return-1;
			else if(l1>l2) return+1;
			else return s1.compareTo(s2);

		};

		List<String> sortedList=list.stream().sorted((c)).collect(Collectors.toList());
	System.out.println(sortedList);
	}
	@Test(priority=9)
	public void minAndMax() {
		/*min()
		max()
		[5,3,10,15,4] ===> natural order

		[3,4,5,10,15]===> Ascending order min value is =3
		[15,10,5,4,3]===> Descending order min value is =15

		 * */
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(3);
		l.add(10);
		l.add(15);
		l.add(4);
		l.add(5);
		l.add(7);
		System.out.println(l);
		Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		// change the sorting order min and max value will be changed
		Integer min1=l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(min1);
		Integer max1=l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(max1);
	}
	@Test(priority=10)
	public void AdvanceWay() {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(3);
		l.add(10);
		l.add(15);
		l.add(4);
		l.add(5);
		l.add(7);
		System.out.println(l);
		//l.stream().forEach(System.out::println);
		//Consumer<Integer> c=i->{
		l.stream().forEach(i->{
			System.out.println("The Square of "+i+" is "+(i*i));
		});
		//l.stream().forEach(c);
		/*
-------------------------------------------------------------------------------
Consumer<Integer> c=i->{
			System.out.println("The Square of "+i+" is "+(i*i));
		};
		l.stream().forEach(c);
	}
simple way to achive above===>
---------------------------------------------------------------------------------
l.stream().forEach(i->{
			System.out.println("The Square of "+i+" is "+(i*i));
		});
---------------------------------------------------------------------------------
		  */
	}
	@Test(priority = 11)
	public void ArrayListToArray() {
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(14);
		l.add(5);
		l.add(7);
		l.add(2);
		l.add(22);
		l.add(45);
		Integer[] i=l.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);
//		for(Integer i1 :i ) {
//			System.out.println(i1);
//		}
	}
	@Test(priority=12)
	public void StreamMethodUse() {
		// we can collection of array to print array using stream of method
		Stream<Integer> s=Stream.of(9,99,999,9999,99999,999999);
		s.forEach(System.out::println);
		//We can get integer array and print easily using stream of method
		Integer[] i= {10,20,30,40,50};
		Stream.of(i).forEach(System.out::println);
	}
	@Test(priority=13)
	public void AlpbhbeticalOrderCount() {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Ganesh");
		l.add("Pranav");
		l.add("Anna");
		l.add("Pranavi");
		l.add("Oviya");
		
		//there is no life for intermediate operation if there is no terminal operation
		//terminal operation will execute only if internal operation (filter) returns true
		//we can create stream
		//how to use filter in stream API 
		Long c=l.stream().filter(p->p.startsWith("P")).count();
		System.out.println(c);
	}
	
}
