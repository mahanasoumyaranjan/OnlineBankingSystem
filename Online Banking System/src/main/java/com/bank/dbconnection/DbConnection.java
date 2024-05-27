package com.bank.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		String className = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";

		Class.forName(className);
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
}
