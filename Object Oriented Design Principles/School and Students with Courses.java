import java.util.*;

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public List<Course> getCourses() {
        return courses;
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}

public class Main1 {
    public static void main(String[] args) {
        School school = new School("ABC High School");
        
        Student student1 = new Student("John");
        Student student2 = new Student("Alice");
        
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        
        student1.enroll(math);
        student1.enroll(science);
        student2.enroll(math);
        
        school.addStudent(student1);
        school.addStudent(student2);
        
        System.out.println(student1.getName() + "'s courses:");
        for (Course course : student1.getCourses()) {
            System.out.println("- " + course.getName());
        }
        
        System.out.println("\n" + math.getName() + " students:");
        for (Student student : math.getStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
