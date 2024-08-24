package com.abstraction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDriver="com.microsoft.jdbc.sqlserver.SQLServerDriver";
				//"com.mysql.jdbc.Driver";
		String user = "myuser";
        String pass = "myuser";
		String url="jdbc:sqlserver://localhost:52493;Database=person;encrypt=true;trustServerCertificate=true";
		//String u="jdbc:sqlserver://localhost:1433/databaseName=person";
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try {
			con=DriverManager.getConnection(url,user,pass);
			//System.out.println("Database connected....");
			stmt=con.createStatement();
			//String insertQuery="insert into student values(3,'Ganesh', 'Kale', 'Karadi','India')";
					//+"Values(22,'Ganesh', 'Kale', 'Karadi','India')";
			//stmt.execute(insertQuery);
			String query="select * from Student";
			rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				String firstName=rs.getString("Fname");
				System.out.println(rs.getRow());
				System.out.println(firstName);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
