package com.tech.Student_Database_Management;

import java.sql.*;

public class View_All {
	public void viewAllStudents() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String pass = "shrecodersql";
		Connection connect = DriverManager.getConnection(url,user,pass);
		Statement stmt = connect.createStatement();
		String a = "use Student_Database_Management";
		stmt.executeUpdate(a);
		ResultSet rS = stmt.executeQuery("SELECT student_name FROM students");
		 while (rS.next()) {
		        String n = rS.getString("student_name");
		        System.out.println("Name: "+n);
		    }
	}
}