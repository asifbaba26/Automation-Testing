package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabase_emp_try_Catch {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println("Error : " + e.getMessage());
		}
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsj_mysql", "root", "tiger");
				Statement stmt = conn.createStatement();
				ResultSet res = stmt.executeQuery("select * from emp");) {

			while (res.next()) {

				int id = res.getInt("id");
				String firstname = res.getString("firstname");
				String lastname = res.getString("lastname");
				String address = res.getString("address");
				System.out.println(id + "\t" + firstname + "\t" + lastname + "\t" + address);
			}
		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
