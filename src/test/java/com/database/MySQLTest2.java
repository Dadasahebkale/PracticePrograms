package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLTest2 {

	public static void main(String[] args) {
		try
		
        {
			String url="jdbc:sqlserver://localhost:52493;Database=person;encrypt=true;trustServerCertificate=true";
			String user="myuser";
			String pass="myuser";
            Connection conn = (Connection) DriverManager.getConnection(url,user,pass);//"jdbc:sqlserver://localhost:52493;Database=person;user=root;password=root;encrypt=true;trustServerCertificate=true"); 
            Statement   s = (Statement) conn.createStatement();
            int result = s.executeUpdate("CREATE DATABASE Students");
            System.out.println("Connected..");
        }


        catch ( Exception e)
        {
        	System.out.println("Database connection issue...");
            e.printStackTrace();
        }
		}  

	
}
