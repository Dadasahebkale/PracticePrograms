package com.string;

import org.testng.annotations.Test;

public class PrintNameWithoutLoop {

	public static void main(String[] args) {
		String name="Dadasaheb";
		String s="i";
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", name+"\n");
		//System.out.println(s);
		String str="ganesh\n";
		str=str.repeat(10);
		System.out.println(str);
		
	}
	@Test(enabled = false)
	public void getPrint() {
		System.out.println("Dada");
	}
	@Test(enabled = false)
	public static void printNames() {
		String name="Ganesh";
		String s="i";
		s=s.replaceAll("i", "iiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiii");
		s=s.replaceAll("i", name+"\n");
		System.out.println(s);
	}

}
