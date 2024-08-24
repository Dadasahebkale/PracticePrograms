package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferReader {

	public static void main(String[] args) {
		String path="C:\\Users\\Ganesh\\Downloads\\file\\sample.text";
		BufferedReader br=null;
		
		try {
		File file=new File(path);
		br=new BufferedReader(new FileReader(file));
		System.out.println("File content is ...");
		int c=0;
		while((c=br.read())!=-1) {
			System.out.print((char)c);
		}
		} catch (Exception e) {
			System.out.println("Some Eception in coming..");
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
