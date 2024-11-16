package com.upload;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileUpload {
	static public String url="D:\\CucumberLatest\\automation\\TextFile.txt";
	public static void main(String[] args) throws IOException {
	
//	Properties prop=new Properties();
//	FileInputStream fis=new FileInputStream(url);
//	prop.load(fis);
	Map<String, String> map=getData(url);
	
	//map.put(map.get(prop), prop.getProperty(name));
//	System.out.println(prop.getProperty("class"));
//	System.out.println(prop.getProperty("name"));
//	System.out.println("School");
//	System.out.println("Board");
//	System.out.println("Subject");
//	System.out.println("Url");
	System.out.println(map);
	}
	public static Map<String, String> getData(String url) throws IOException {
		Map<String,String> map=new HashMap<String,String>();
		BufferedReader read=new BufferedReader(new FileReader(url));
		String line;
		while((line=read.readLine())!=null ){
			String [] parts=line.split("=");
			if(parts.length==2) {
				map.put(parts[0].trim(), parts[1].trim());
			}
		}
		return map;
	}

}
