package com.jdbc.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class TestDatabase_CallableStatement_Ex_StoredProcedure {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/fsj_mysql";
		String user = "root";
		String pwd = "tiger";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println("Error : " + e.getMessage());
		}
		try (Connection conn = DriverManager.getConnection(url, user, pwd);
				CallableStatement cst = conn.prepareCall("{call sqr_cube(?,?,?)}"); // "sqr_cube" is function name
				Scanner sc = new Scanner(System.in);) {
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			cst.setInt(1, num);
			cst.registerOutParameter(2, Types.INTEGER);
			cst.registerOutParameter(3, Types.INTEGER);
			cst.execute();
			int square = cst.getInt(2);
			int cube = cst.getInt(3);
			System.out.println("SQUARE:"+square + " " +"CUBE:"+ cube);

		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
