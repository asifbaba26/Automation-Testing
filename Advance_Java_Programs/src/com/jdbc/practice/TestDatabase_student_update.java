package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabase_student_update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//creating connection with database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsj_mysql", "root", "tiger");
		//creating statement
		Statement stmt = conn.createStatement();
		//executing sql statements
		ResultSet res = stmt.executeQuery("select * from student");

		while (res.next()) { //true 
		
			int id = res.getInt("id");
			String name = res.getString("name");
			String address = res.getString("address");
			System.out.println(id+"\t"+name+"\t"+address);
		}
	}

}
