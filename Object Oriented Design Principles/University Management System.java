import java.util.List;
import java.util.ArrayList;

class Course {
    private String courseCode;
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseCode + " - " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
        System.out.println();
    }
}

class Student {
    private String studentId;
    private String name;
    private List<Course> courses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseCode() + ": " + course.getCourseName());
        }
        System.out.println();
    }
}

class Professor {
    private String professorId;
    private String name;
    private List<Course> courses;

    public Professor(String professorId, String name) {
        this.professorId = professorId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getProfessorId() {
        return professorId;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }

    public void displayCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseCode() + ": " + course.getCourseName());
        }
        System.out.println();
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student student1 = new Student("S001", "Alice Johnson");
        Student student2 = new Student("S002", "Bob Williams");

        Professor professor1 = new Professor("P001", "Dr. Smith");
        Professor professor2 = new Professor("P002", "Dr. Brown");

        Course course1 = new Course("CS101", "Introduction to Computer Science");
        Course course2 = new Course("MATH201", "Advanced Mathematics");

        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        course1.displayCourseInfo();
        course2.displayCourseInfo();

        student1.displayCourses();
        professor1.displayCourses();
    }
}
