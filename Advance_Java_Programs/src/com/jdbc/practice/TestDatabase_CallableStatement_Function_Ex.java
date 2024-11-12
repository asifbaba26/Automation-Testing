package com.jdbc.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class TestDatabase_CallableStatement_Function_Ex {

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
				CallableStatement cst = conn.prepareCall("{?=call sqr(?)}"); // "sqr" is function name
				Scanner sc = new Scanner(System.in);) {
           System.out.print("Enter the number: ");
           int num=sc.nextInt();
           cst.registerOutParameter(1,Types.INTEGER);
           cst.setInt(2, num);
           cst.execute();
           int result=cst.getInt(1);
           System.out.println("Square of "+num+" = "+result);
			
		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
