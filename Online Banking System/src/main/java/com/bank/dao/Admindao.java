package com.bank.dao;

import java.sql.*;

import com.bank.dbconnection.DbConnection;

public class Admindao {
	public static boolean validate(String email, String password) {
		boolean status = false;
		try {
			Connection conn = DbConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Admin WHERE email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			conn.close();
		} catch (Exception ob) {
			ob.printStackTrace();
		}
		return status;
	}
}
