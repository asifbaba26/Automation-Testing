package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestDatabase_PreparedStatement_Ex {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/fsj_mysql";
		String user="root";
		String pwd="tiger";
		String sql="insert into prep_stmt_emp values(?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println("Error : " + e.getMessage());
		}
		try (Connection conn = DriverManager.getConnection(url, user, pwd);
				PreparedStatement pst = conn.prepareStatement(sql)) {
			
			for (int i = 1; i <= 10; i++) {
				pst.setInt(1, i);
				pst.setString(2, "Name-"+i);
				pst.setDouble(3, 1000.0*i);
				pst.addBatch();
			}			
			int[] status = pst.executeBatch();
			System.out.println(status.length+" records inserted into prep_stmt_emp");
		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
