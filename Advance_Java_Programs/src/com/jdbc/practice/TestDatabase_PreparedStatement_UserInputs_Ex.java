package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestDatabase_PreparedStatement_UserInputs_Ex {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println("Error : " + e.getMessage());
		}
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsj_mysql", "root", "tiger");
				PreparedStatement pst = conn.prepareStatement("insert into prep_stmt_emp values(?,?,?)");
				Scanner sc = new Scanner(System.in);) {

			for (int i = 1; i <= 3; i++) {
				System.out.print("Enter id :");
				int id = sc.nextInt();
				System.out.print("Enter name :");
				String name = sc.next();
				System.out.print("Enter sal :");
				double sal = sc.nextDouble();
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setDouble(3, sal);
				pst.addBatch();

			}
			int[] count = pst.executeBatch();
			System.out.println(count.length + " inserted into prep_stmt_emp");

		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
