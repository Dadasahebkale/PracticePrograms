package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<String> teamA=Arrays.asList("Rohit","Virat","Surya");
		List<String> teamB=Arrays.asList("Rushabh","Shreyesh","Hardik");
		List<String> teamC=Arrays.asList("Bumrah","Sami","Akshar");
		List<List<String>> players=new ArrayList<List<String>>();
		players.add(teamA);
		players.add(teamB);
		players.add(teamC);
		for(List<String> team : players) {
			for(String name : team) {
				System.out.println(name);
			}
		}
		List<String> names=players.stream().flatMap(p->p.stream()).collect(Collectors.toList());
		System.out.println(names);
	}

}
