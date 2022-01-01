package com.bankmanagement.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bankmanagement.model.customerDetails;

public class customerDao {
    public int registerEmployee(customerDetails customerobj) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO customerUser" +
            "  (id, name, mob_no, email, password, account_balance) VALUES " +
            " (?, ?, ?, ?, ?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/bankdb?useSSL=false", "root", "root");
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, customerobj.getName());
                preparedStatement.setString(3, customerobj.getMob_no());
                preparedStatement.setString(4, customerobj.getEmail());
                preparedStatement.setString(5, customerobj.getPassword());
                preparedStatement.setInt(6, customerobj.getAccount_balance());
                System.out.println(preparedStatement);
                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                result = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            return result;
        }

	private void printSQLException(SQLException e) {
		 for (Throwable e1: e) {
	            if (e1 instanceof SQLException) {
	                e1.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e1).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e1).getErrorCode());
	                System.err.println("Message: " + e1.getMessage());
	                Throwable t = e1.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
		
	}
}
}