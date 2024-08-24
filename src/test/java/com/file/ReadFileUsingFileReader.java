package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {
		String path="C:\\Users\\Ganesh\\Downloads\\file\\sample.text";
		FileReader fr=null;
		try {
		//File file=new File(path);
		fr=new FileReader(path);
		System.out.println("File content is .......");
		int c=0;
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
		}
		}
		catch(Exception e) {
			System.out.println("Exception someting coming....");
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
