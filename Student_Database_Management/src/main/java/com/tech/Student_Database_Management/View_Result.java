package com.tech.Student_Database_Management;

import java.sql.*;
import java.util.*;

public class View_Result {
	public void viewResult ()throws ClassNotFoundException, SQLException {
	    Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String pass = "shrecodersql";
		Connection connect = DriverManager.getConnection(url,user,pass);
		Statement stmt = connect.createStatement();
		String a = "use Student_Database_Management";
		stmt.executeUpdate(a);
		ResultSet rS = stmt.executeQuery("SELECT * FROM students");
		 while (rS.next()) {
		        String i = rS.getString("Id");
		        String n = rS.getString("student_name");
		        String re = rS.getString("course_name");
		        int m = rS.getInt("marks");
		        int t = rS.getInt("total");
		        float p = rS.getFloat("percent");
		        String g = rS.getString("grade");
		       System.out.println("ID: "+i+", Name: "+n+", Age: "+re+", Marks: "+m+", Total:  "+t+",  Percentage:  "+p+", Grade:  "+g);
		 }
}
}