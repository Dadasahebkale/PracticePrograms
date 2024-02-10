package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamDemo {
@Test(priority=1)
public void operationOnString() {
	ArrayList<String> l=new ArrayList<String>();
	l.add("Pranav");
	l.add("Oviya");
	l.add("Pranavi");
	l.add("Dada");
	List<String> names=Arrays.asList("Azbhijeet","Alakya","Rama","Don","Ganesh","Rupesh","HaRya");
	names.stream().filter(s->s.contains("R")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	System.out.println("=============================================");
	//We can merge two arrayList using concat method
	Stream<String> list=Stream.concat(l.stream(), names.stream());
//	list.sorted().forEach(s->System.out.println(s));
	//we can match 
	boolean flag=list.anyMatch(s->s.equalsIgnoreCase("Rama"));
	Assert.assertTrue(flag);
}
@Test(priority=2)
public void streamCollect() {
	List<Integer> values=Arrays.asList(3,2,4,2,3,4,5,6,7,9,11,23);
	values.stream().sorted().distinct().forEach(s->System.out.println(s));
	List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(li);
	
}

}
