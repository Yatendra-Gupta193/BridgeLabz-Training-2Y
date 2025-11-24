package com.tech.Student_Database_Management;

import java.sql.*;
import java.util.*;

public class Update_Student {
	public void updateStudent() throws ClassNotFoundException, SQLException {
	    Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String pass = "shrecodersql";
		Connection connect = DriverManager.getConnection(url,user,pass);
		Statement stmt = connect.createStatement();
		String a = "use Student_Database_Management";
		stmt.executeUpdate(a);
		System.out.println("Whose detail you want to update? (Enter ID)");
		String n = sc.nextLine();
		System.out.println("What do you want to Update?");
    	String Type = sc.nextLine(); 
		switch(Type) {
    	case "student_name":
            System.out.println("Enter new student name:");
            String n2 = sc.nextLine();
            String updateQuery1 = "UPDATE students SET student_name = "+ n2 +" WHERE id = "+n;
            stmt.executeUpdate(updateQuery1);
            break;

        case "course_name":
            System.out.println("Enter new course name:");
            String newCourse = sc.nextLine();
            String updateQuery2 = "UPDATE students SET course_name = "+newCourse+" WHERE id = "+n;
            stmt.executeUpdate(updateQuery2);
            break;

        case "marks":
            System.out.println("Enter new marks:");
            int newMarks = sc.nextInt();
            String updateQuery3 = "UPDATE students SET marks = "+newMarks+" WHERE id = "+n;
            stmt.executeUpdate(updateQuery3);
            break;

        case "total":
            System.out.println("Enter new total:");
            int newTotal = sc.nextInt();
            String updateQuery4 = "UPDATE students SET total = " + newTotal+ "WHERE id = "+n;
            stmt.executeUpdate(updateQuery4);
            break;

        case "percent":
            System.out.println("Enter new percent:");
            float newPercent = sc.nextFloat();
            String updateQuery5 = "UPDATE students SET percent = "+newPercent+" WHERE id = "+n;
            stmt.executeUpdate(updateQuery5);
            break;

        case "grade":
            System.out.println("Enter new grade:");
            String newGrade = sc.nextLine();
            String updateQuery6 = "UPDATE students SET grade = "+newGrade+" WHERE student_name = ?";
            stmt.executeUpdate(updateQuery6);
            break;

        default:
            System.out.println("Invalid update field!");    	}
    	
	}

}


