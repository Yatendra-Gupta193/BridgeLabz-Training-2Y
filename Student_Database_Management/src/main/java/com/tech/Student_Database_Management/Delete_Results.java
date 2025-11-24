package com.tech.Student_Database_Management;

import java.sql.*;
import java.util.*;

public class Delete_Results {
	public void deleteResults() throws ClassNotFoundException, SQLException {
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
    	String insert = "UPDATE students SET marks = NULL, total = NULL, percent = NULL, grade = NULL WHERE id = "+Id;
		stmt.executeUpdate(insert);
	}
}