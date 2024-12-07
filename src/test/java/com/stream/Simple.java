package com.stream;

import java.util.stream.Stream;

public class Simple {

	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e->e%2==0).forEach(e->System.out.println(e));

	}

}
