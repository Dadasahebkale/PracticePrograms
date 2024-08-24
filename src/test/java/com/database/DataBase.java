package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDriver="com.microsoft.jdbc.sqlserver.SQLServerDriver";
		String url="jdbc:sqlserver://localhost:80";
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try {
			con=DriverManager.getConnection(url,"root","Ganesh@01");
			//System.out.println("Database connected....");
			stmt=con.createStatement();
			String insertQuery="insert into Records(RollNum,FName,LastName,Address,Country"
					+"values(22,'anesh', 'ale', 'Karadi','ndia')";
			stmt.execute(insertQuery);
			String query="select * from Records";
			rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				String firstName=rs.getString("RollNum");
				System.out.println(rs.getRow());
				System.out.println(firstName);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
