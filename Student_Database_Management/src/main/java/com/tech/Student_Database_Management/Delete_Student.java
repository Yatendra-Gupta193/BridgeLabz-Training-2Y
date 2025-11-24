package com.tech.Student_Database_Management;

import java.sql.*;
import java.util.*;

public class Delete_Student {
	public void deleteStudent() throws ClassNotFoundException, SQLException {
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
		String query = "DELETE FROM students WHERE id = ?";

        PreparedStatement pstmt = connect.prepareStatement(query);
        pstmt.setString(1, Id);

        pstmt.executeUpdate();
	}
}