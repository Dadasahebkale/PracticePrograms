package com.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	static public String url="D:\\CucumberLatest\\automation\\TextFile.txt";

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(url));
		String startLine;
		while((startLine=br.readLine())!=null) {
			System.out.println(startLine);
		}
		br.close();
	}

}
