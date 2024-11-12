package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestDatabase_student_update_try_Catch {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println("Error : " + e.getMessage());
		}
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsj_mysql", "root", "tiger");
				Statement stmt = conn.createStatement();
				Scanner sc = new Scanner(System.in);) {

//			for(int i=1;i<=3;i++) {
//				System.out.print("Enter id :");
//				int id=sc.nextInt();
//				System.out.print("Enter name :");
//				String name=sc.next();
//				System.out.print("Enter address :");
//				String address=sc.next();
//				String sql="insert into student values("+id+",'"+name+"','"+address+"');";
//				System.out.println(sql);
//				stmt.executeUpdate(sql);
//				
//			}

			stmt.executeUpdate("insert into student values(1000,'jdbc1','Advance1')");
			System.out.println("insertion sccessful..");

			stmt.executeUpdate("update student set name='jdbc2' where id=1000");
			System.out.println("updation sccessful..");

			stmt.executeUpdate("delete from student where id=1000");
			System.out.println("deletion sccessful..");

		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
