package com.utills;

/**
 * Class to connect applications to MySql Database.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	private static Connection connection = null;
	private static String className = "com.mysql.jdbc.Driver";
	private static String host = "jdbc:mysql://localhost:3306/";
	private static String dbName = "carbecho";
	private static String userID = "root";
	private static String password = "root";

	private Connector() {
	}

	private static void initConnection() {

		try {
			Class.forName(className); // Load class dynamically.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(host + dbName, userID,
					password);
			// Create a connection with given properties.
		} catch (SQLException e) {
			System.out.println("Incorrect properties");
			e.printStackTrace();
		}
	}

	// Return object of connection created.
	public static Connection getConnection() {
		if (connection == null) {
			initConnection();
		}
		return connection;
	}

	// Close Connection.
	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
