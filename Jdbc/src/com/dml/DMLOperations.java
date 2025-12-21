package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("Driver Registered");

		// connection estab
		String url = "jdbc:mysql://localhost:3306/flm_adv_java";
		String userName = "root";
		String password = "root";

		/// driver manger
		Connection connection = DriverManager.getConnection(url, userName, password);

		/// stmt
		Statement statement = connection.createStatement();
		/// query
		String query = "insert into employee values (10,'abc@gmail.com',30000)";

		/// exection
		statement.executeUpdate(query);

		System.out.println("inserted data");

		String query2 = "Update employee set salary =30000 where empId = 9";
		statement.executeUpdate(query2);
		System.out.println("update the date ....");

		String query3 = "Delete from employee where empId = 1";
		System.out.println(query3);

	}

}
