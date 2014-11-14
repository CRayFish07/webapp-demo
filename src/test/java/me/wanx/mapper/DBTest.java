package me.wanx.mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url,user,password;
			url = "jdbc:mysql://localhost:3306/maven_test";
			user = "root";
			password = "";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
