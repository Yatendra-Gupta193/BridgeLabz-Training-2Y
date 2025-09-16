import java.util.ArrayList;

class EmployeeManagementSystem {
    private static String companyName = "CodInClub";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Company: " + companyName);
    }
    public static void checkInstance(Object obj) {
        if (obj instanceof Employee) {
            ((Employee) obj).printDetails();
        } else {
            System.out.println("Not an instance of Employee");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "Developer");
        Employee emp2 = new Employee("Jane Smith", 102, "Manager");
        
        Employee.displayTotalEmployees();
        
        Employee.checkInstance(emp1);
        Employee.checkInstance("Not an employee");
    }
}
