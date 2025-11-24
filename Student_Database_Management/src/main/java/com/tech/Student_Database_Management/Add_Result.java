package com.tech.Student_Database_Management;

import java.util.*;
import java.sql.*;

public class Add_Result {
	public void AddResult() throws ClassNotFoundException, SQLException {
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
		System.out.println("Enter Marks:");
		int M = sc.nextInt();
		int T = 100;
		float P;
		try{
			int ac = M/T;
			P = ac*100;
			String G;
			if(90<P||P<=100) {
				G = "A+";
			}else if(80<P||P<=90) {
				G = "A";
			}else if(70<P||P<=80) {
			     G = "B";
			}else if(60<P||P<=70) {
			     G = "C";
			}else if(50<P||P<=60) {
			     G = "D";
			}else{
			    G = "F";
		    }
			String insert = "UPDATE students SET marks = "+M+", total = "+T+", percent = "+P+", grade = "+G+" WHERE id = "+Id;
			stmt.executeUpdate(insert);
		}catch(ArithmeticException e) {
			System.out.println("MArks less then 0 or more than 100");
		}
}
}
