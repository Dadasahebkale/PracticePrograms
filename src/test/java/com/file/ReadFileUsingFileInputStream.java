package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) {
		String path="C:\\Users\\Ganesh\\Downloads\\file\\sample.text";
		FileInputStream fis=null;
		try {
		File file=new File(path);
		fis=new FileInputStream(file);
		System.out.println("File Content is ...");
		int c=0;
		while((c=fis.read())!=-1) {
			System.out.print((char)c);
		}
		}catch(Exception e) {
			System.out.println("Some exception comming...");
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
