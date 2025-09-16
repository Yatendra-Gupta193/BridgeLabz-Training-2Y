class UniversityManagementSystem {
    private static String universityName = "CodInClub University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }
    public static void checkStudent(Object obj) {
        if (obj instanceof Student) {
            ((Student) obj).displayDetails();
        } else {
            System.out.println("Not a Student instance");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");
        
        Student.displayTotalStudents();
        
        Student.checkStudent(student1);
        Student.checkStudent("Invalid object");
    }
}
