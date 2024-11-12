package com.jdbc.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class TestDatabase_CallableStatement_StoredProcedure_SumAvg_StudentMarks {

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
				CallableStatement cst = conn.prepareCall("{call get_sum_avg(?,?,?)}"); // "get_sum_avg" is function name
				Scanner sc = new Scanner(System.in);) {
			System.out.print("Enter the id: ");
			int id = sc.nextInt();
			cst.setInt(1, id);
//			cst.registerOutParameter(2, Types.INTEGER);
//			cst.registerOutParameter(3, Types.FLOAT);
			cst.execute();
			int sum = cst.getInt(2);
			double avg = cst.getDouble(3);
			System.out.println("SUM:"+sum + " " +"AVERAGE:"+ avg);

		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
