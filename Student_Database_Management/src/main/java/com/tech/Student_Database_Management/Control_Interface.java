package com.tech.Student_Database_Management;

import java.sql.*;
import java.util.Scanner;

public class Control_Interface {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);

        Add_Student add = new Add_Student();
        View_All view = new View_All();
        Update_Student update = new Update_Student();
        Delete_Student delete = new Delete_Student();
        Add_Result Add = new Add_Result();
        View_Result Result = new View_Result();
        Delete_Results Del = new Delete_Results();

        int choice;

        do {
            System.out.println("\n====== Student Database Management ======");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. View Results");
            System.out.println("6. Delete Results");
            System.out.println("7. Add Results");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    add.AddStudent();
                    break;

                case 2:
                    view.viewAllStudents();
                    break;

                case 3:
                    update.updateStudent();
                    break;

                case 4:
                    delete.deleteStudent();   
                    break;

                case 5:
                    Result.viewResult();
                    break;

                case 6:
                    Del.deleteResults();
                    break;

                case 7:
                    Add.AddResult();
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose again.");
            }

        } while (choice != 8);  

        sc.close();
    }
}
