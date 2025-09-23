import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> universityFaculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.universityFaculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        universityFaculties.add(faculty);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Faculty> getUniversityFaculties() {
        return universityFaculties;
    }
}

public class Main2 {
    public static void main(String[] args) {
        University university = new University("XYZ University");
        
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");
        
        Faculty profSmith = new Faculty("Dr. Smith");
        Faculty profJohnson = new Faculty("Dr. Johnson");
        Faculty profBrown = new Faculty("Dr. Brown");
        
        csDepartment.addFaculty(profSmith);
        mathDepartment.addFaculty(profJohnson);
        university.addFaculty(profBrown);
        
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);
        
        System.out.println("University departments:");
        for (Department dept : university.getDepartments()) {
            System.out.println("- " + dept.getName());
        }
        
        System.out.println("\nComputer Science department faculties:");
        for (Faculty faculty : csDepartment.getFaculties()) {
            System.out.println("- " + faculty.getName());
        }
        
        university = null;
        
        System.out.println("\nAfter deleting university:");
        System.out.println("Faculty still exists: " + profSmith.getName());
        System.out.println("Faculty still exists: " + profBrown.getName());
    }
}
