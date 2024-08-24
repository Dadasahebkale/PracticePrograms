package com.file;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadFileUsingNIO {

	public static void main(String[] args) {
		String path="C:\\Users\\Ganesh\\Downloads\\file\\sample.text";
		try {
		List<String> li=	Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
		Iterator<String> itr=li.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
		}
		}
		catch(Exception e) {
			System.out.println("Exception something occuring...");
			e.printStackTrace();
		}
	}

}
