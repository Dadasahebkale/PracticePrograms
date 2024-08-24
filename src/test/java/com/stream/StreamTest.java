package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8).filter(s->s%2==0).forEach(s->System.out.println(s));
		Stream.of(1,2,3,4,5,6,7,8).filter(e->e%2!=0).forEach(e->System.out.println(e));
	List<Integer>list=new ArrayList<Integer>();
//		list.stream().filter(s->s.)	
//	list.stream.f.forEach(s->getFact(System.out.println(5)));
		}
	public static int getFact(int num) {
		int fact=1;
		if(num<1)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact+i;
		}
		return fact;
	}

}
