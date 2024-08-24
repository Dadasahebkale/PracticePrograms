package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {
	public static PreparedStatement ps;
	public static void main(String[] args) throws SQLException {
		int rol=7;
		String n="Dada";
		String l="Kale";
		String a="Pune";
		String c="India";
		Connection con;
		Statement stmt;
		String query;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		stmt=con.createStatement();
		//String insertvalue="insert into records values(5,'Pranav', 'Kale','Kharadi','India')";
		String insertvalue="insert into records values(?,?,?,?,?)";
		ps=con.prepareStatement(insertvalue);
		//ps= con.prepareStatement("insert into records values(?,?,?,?,?)");
		ps.setInt(1, rol);
		ps.setString(2, n);
		ps.setString(3, l);
		ps.setString(4, a);
		ps.setString(5, c);
		
		ps.executeUpdate();
		System.out.println("Records has been updated");
		query="SELECT * FROM records";
		rs=stmt.executeQuery(query);
		while(rs.next()) {
			String firstName=rs.getString("FName");
			System.out.print(rs.getRow()+" ");
			System.out.print(firstName+" | ");
		}
		//con.prepareStatement("insert into records values(5,'Pranav', 'Kale','Kharadi','India')");
			
			System.out.println("Connected Successfully...");
		} catch (ClassNotFoundException e) {
			System.out.println("Connectivity problem occurs");
			e.printStackTrace();
		}

	}

}
