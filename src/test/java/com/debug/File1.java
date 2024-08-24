package com.debug;

import java.io.FileReader;
import java.io.FileWriter;

public class File1 {

	public static void main(String[] args) {
		try {
			
			FileReader fr=new FileReader("in.dat");
			FileWriter fw=new FileWriter("out.dat");
			int ch;
			while((ch=fr.read())!=-1) {
				fw.write(ch);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
