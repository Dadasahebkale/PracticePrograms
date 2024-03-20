package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

	public static void main(String[] args) {

		String str="Selenium java cucumber bdd testNG sql API";
		System.out.println(str.substring(9,13));
		ArrayList<String> s =new ArrayList<String>(Arrays.asList(str.split(" ")));
		System.out.println(s);
		System.out.println("============================");
		List<String> myList=new ArrayList<String>(Arrays.asList(str.split(" ")));
		System.out.print(myList);

	}

}
