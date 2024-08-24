/**
 * 
 */
package com.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Create a file in java
 * using 
 * 1. file
 * 2.fileoutput stream
 * 3.java NIO utils
 */
public class FileHandling {

	
	public static void main(String[] args) {
		String path="C:\\Users\\Ganesh\\Downloads\\file\\sample.text";
		//1: Using file:
		File file=new File(path);
		
		try {
		boolean flag=file.createNewFile();
			if(flag) {
				System.out.println("file is created ");
			}else {
				System.out.println("File already present....");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//		//FileOutPutStream
//		try {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter file name location path ");
//			String fileName=sc.nextLine();
//			FileOutputStream fos=new FileOutputStream(fileName, true);
//			System.out.println("Enter the File Content :");
//			String content=sc.nextLine();
//			byte b[]=content.getBytes();
//			fos.write(b);
//			fos.close();
//			System.out.println("File is saved on given folder...");
//			
//		}catch(Exception e) {
//			System.out.println("Some exception comming.....");
//			e.printStackTrace();
//		}
//		
		//java nio package
		try {
			Path pathlocation=Paths.get("C:\\Users\\Ganesh\\Downloads\\file\\newFile.text");
		Path newPath=Files.createFile(pathlocation);	
		
		System.out.println("New file is created "+newPath);
		Scanner sc=new Scanner(System.in);
		String fileName=sc.nextLine();
		FileOutputStream fos=new FileOutputStream(fileName);
		System.out.println("Enter the File Content :");
		String content=sc.nextLine();
		byte b[]=content.getBytes();
		fos.write(b);
		fos.close();
		sc.close();
		System.out.println("File is saved on given folder...");
			
		}catch(Exception e) {
			System.out.println("Some exception is comming...");
			e.printStackTrace();
		}
	}

}
