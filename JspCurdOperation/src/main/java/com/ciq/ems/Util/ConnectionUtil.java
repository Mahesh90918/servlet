package com.ciq.ems.Util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;

public class ConnectionUtil {

	private static Connection connection = null;

	private static Properties properties = new Properties();
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			properties.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			connection = DriverManager.getConnection(properties.getProperty("mysql.url"),
					properties.getProperty("mysql.user"), properties.getProperty("mysql.password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		return connection;

	}

	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void closeConnection(Connection connection, Statement sta) {
		try {
			connection.close();
			sta.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void closeConnection(Connection connection, Statement sta, ResultSet rs) {
		try {
			rs.close();
			ConnectionUtil.closeConnection(connection, sta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println(ConnectionUtil.getConnection());
	}

}
