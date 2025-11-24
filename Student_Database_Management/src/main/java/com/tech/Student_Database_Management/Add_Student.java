package com.tech.Student_Database_Management;

import java.util.*;
import java.sql.*;

public class Add_Student {
	public void AddStudent() throws ClassNotFoundException, SQLException {
	    Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String pass = "shrecodersql";
		Connection connect = DriverManager.getConnection(url,user,pass);
		Statement stmt = connect.createStatement();
		String a = "use Student_Database_Management";
		stmt.executeUpdate(a);
		System.out.println("Enter Id:");
		String Id = sc.nextLine();
		System.out.println("Enter student_name:");
    	String student_name = sc.nextLine(); 
    	System.out.println("Enter course_name:");
    	String course_name = sc.nextLine(); 
    	
    	String insert = "INSERT INTO students (id, student_name, course_name) VALUES ('"
                + Id + "', '" + student_name + "', '" + course_name + "')";
		stmt.executeUpdate(insert);
	}
}