package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabase_emp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsj_mysql", "root", "tiger");
		Statement stmt = conn.createStatement();

		stmt.executeUpdate("update emp set lastname='Anthagalla' where id=2;"); //to update the last name

		ResultSet res = stmt.executeQuery("select * from emp");

		while (res.next()) {

			int id = res.getInt("id");
			String firstname = res.getString("firstname");
			String lastname = res.getString("lastname");
			String address = res.getString("address");
			System.out.println(id + "\t" + firstname + "\t" + lastname + "\t" + address);
		}
	}

}
