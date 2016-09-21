package com.util;

/**
 * Class to connect applications to MySql Database.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Connector {
	private static Connection connection = null;
	private static String className = "com.mysql.jdbc.Driver";
	private static String host = "jdbc:mysql://localhost:3306/";
	private static String dbName = "carbecho";
	private static String userID = "root";
	private static String password = "root";

	private Connector() {
	}

	/**
	 * Initialize properties from the property file.
	 * 
	 * @return Number of property initialized.
	 */
	/*private static int initProperties() {
		InputStream input = null;
		Properties prop = new Properties();
		try {
			input = new FileInputStream("resources/config.properties"); // get
																		// properties
																		// from
																		// file.
			prop.load(input);
			if (prop.size() != 5) {
				return -1;
			}
			className = prop.getProperty("className");
			host = prop.getProperty("host");
			dbName = prop.getProperty("dbName");
			userID = prop.getProperty("userID");
			password = prop.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}*/

	private static void initConnection() {
		/*int i = initProperties();
		if (i == -1) { // if there is not property initialized.
			System.out.println("Blank file of Properties");
		}*/
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
