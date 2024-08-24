package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		copyFile();

	}
	public static void copyFile() {
		String url="C:\\Users\\Ganesh\\Downloads\\worksheet -2.pdf";
		String url2="C:\\Users\\Ganesh\\Downloads\\worksheet sampleCopy-2.pdf";
		File fileurl=new File(url);
		File opFile =new File(url2);
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream(fileurl);
			fos=new FileOutputStream(opFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(fis.available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=0;
		try {
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
