package session1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Connector {
	private static Connection connection = null;
	private static String className = null;
	private static String host = null;
	private static String dbName = null;
	private static String userID = null;
	private static String password = null;

	private Connector() {
	}

	private static int initProperties() {
		InputStream input = null;
		Properties prop = new Properties();
		try {
			input = new FileInputStream("resources/config.properties");
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 1;
	}

	private static void initConnection() {
		int i = initProperties();
		if (i == -1) {
			System.out.println("Blank file of Properties");
		}
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(host + dbName, userID,
					password);
		} catch (SQLException e) {
			System.out.println("Incorrect properties");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if (connection == null) {
			initConnection();
		}
		return connection;
	}

	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
