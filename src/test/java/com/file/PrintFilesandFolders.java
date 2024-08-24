package com.file;

import java.io.File;
import java.util.Arrays;

public class PrintFilesandFolders {
//read and write files and folders using java
	public static void main(String[] args) {
		getFileFolders("E:\\Manual Testing\\Naveen\\API");

	}
	public static void getFileFolders(String path) {
		
		File file=new File(path);
		File downLoad[]=file.listFiles();
		Arrays.sort(downLoad);
		for(File f: downLoad) {
			if(f.isFile()) { // we can print along with name and path as well
				System.out.println("File : "+f.getName()+" "+f.getAbsolutePath());	
			}
			else if(f.isDirectory()) {
				System.out.println("Directory : "+f.getName()+" "+f.getAbsolutePath());
			}else {
				System.out.println("Unknown name : "+f.getName()+" "+f.getAbsolutePath());
			}
		}
	}

}
