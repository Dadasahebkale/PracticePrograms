package com.file;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {
		String path="C:\\Users\\Ganesh\\Downloads\\file\\sample.text";
		try {
			File file=new File(path);
			if(!Desktop.isDesktopSupported()) {
				System.out.println("Desktop is not supported");
				return;
			}
			Desktop desktop=Desktop.getDesktop();
			if(file.exists()) {
				desktop.open(file);
			}
		}catch(Exception e) {
			System.out.println("Some exception is occuring....");
			e.printStackTrace();
		}

	}

}
