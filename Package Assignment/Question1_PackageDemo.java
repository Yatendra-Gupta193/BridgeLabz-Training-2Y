// ======= college.student.Student (conceptually) =======
class Student {
    String name;
    int roll;
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public void showStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + roll);
    }
}
// ======= college.faculty.Faculty (conceptually) =======
class Faculty {
    String name;
    String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void showFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject     : " + subject);
    }
}
// ======= MAIN CLASS (NOT IN ANY PACKAGE) =======
public class Question1_PackageDemo {
    public static void main(String[] args) {

        Student s = new Student("Krishna", 101);
        Faculty f = new Faculty("Ravi Sir", "Java");

        s.showStudent();
        System.out.println();
        f.showFaculty();
    }
}
