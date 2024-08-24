package com.file;

import java.io.File;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) {
		String path="C:\\Users\\Ganesh\\Downloads\\file\\sample.text";
		Scanner sc=null;
		
		try {
			File file=new File(path);
			sc=new Scanner(file);
			System.out.println("File Content is");
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (Exception e) {
			System.out.println("Excption something comming....");
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}

}
