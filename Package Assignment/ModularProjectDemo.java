module collegeinfo {
    exports college.student;
}
package college.student;

public class Student {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll : " + roll);
    }
}
module app {
    requires collegeinfo;
}
import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Krishna", 101);
        s.show();
    }
}



/*
======================================================
   HOW TO COMPILE (Java 9+)
======================================================

Terminal Commands:

1. Compile modules:
   javac -d out/collegeinfo collegeinfo/module-info.java collegeinfo/college/student/Student.java
   javac --module-path out -d out/app app/module-info.java app/MainApp.java

2. Run application:
   java --module-path out -m app/MainApp

======================================================

Difference between Packages and Modules:
----------------------------------------
→ Packages group related classes.
→ Modules group packages + control access using module-info.java.
→ Modules support strong encapsulation and avoid accidental access.
*/
