// ======= com.university.department.cse.Course (conceptual package) =======
class Course {
    public void showCourse() {
        System.out.println("Course: B.Tech Computer Science");
        System.out.println("Department: CSE");
    }
}
// ======= MAIN CLASS (default package) =======
public class Question2_PackageHierarchy {
    public static void main(String[] args) {

        Course c = new Course();
        c.showCourse();

        System.out.println("\nFolder structure should be like:");
        System.out.println("com/university/department/cse/Course.java");
        System.out.println("MainApp2.java in default package");
    }
}
