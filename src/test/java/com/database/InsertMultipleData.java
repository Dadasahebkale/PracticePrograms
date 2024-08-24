package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertMultipleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:sqlserver:localhost//encrypt=true;trustServerCertificate=true;databaseName=person";
        String user = "myuser";
        String pass = "myuser";

        int totalRowsAffected = 0;

        try {
            Connection connection = DriverManager.getConnection(dbURL, user, pass);

            // Data set to be inserted
            Object[][] data = {
                    {10, "Smith", "James", "Riddle Hill", "Chicago"},
                    {20, "Johnson", "Charlie", "North Church", "Chicago"},
                    {30, "Williams", "Oscar", "Red Lake", "Chicago"}
            };

            String insertQuery = "INSERT INTO Persons (PersonID, LastName, FirstName, Address, City) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            for (Object[] row : data) {
                preparedStatement.setInt(1, (int) row[0]);
                preparedStatement.setString(2, (String) row[1]);
                preparedStatement.setString(3, (String) row[2]);
                preparedStatement.setString(4, (String) row[3]);
                preparedStatement.setString(5, (String) row[4]);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    totalRowsAffected += rowsAffected;
                } else {
                    System.out.println("Failed to insert data.");
                }
            }

            // The output message regarding the total number of rows added.
            System.out.println("Data has been successfully added. Total number of rows added: " + totalRowsAffected);

            // Displaying the outcome
            String selectQuery = "SELECT * FROM Persons";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = selectStatement.executeQuery();

            System.out.println("Outcome:");
            System.out.printf("%-10s %-20s %-20s %-30s %-20s%n", "PersonID", "LastName", "FirstName", "Address", "City");

            while (resultSet.next()) {
                System.out.printf("%-10s %-20s %-20s %-30s %-20s%n",
                        resultSet.getInt("PersonID"),
                        resultSet.getString("LastName"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("Address"),
                        resultSet.getString("City"));
            }

            selectStatement.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
