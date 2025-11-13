class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = sal;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public void setSalary(double sal) { this.salary = sal; }

    public void showEmployee() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Dept: " + department + ", Salary: " + salary);
    }
}
class Payroll {
    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        e.setSalary(e.getSalary() + bonus);
    }
}
public class EmployeeManagementDemo {
    public static void main(String[] args) {

        Employee e = new Employee(1, "Krishna", "IT", 30000);
        System.out.println("Before Bonus:");
        e.showEmployee();

        Payroll p = new Payroll();
        p.calculateBonus(e);

        System.out.println("\nAfter Bonus:");
        e.showEmployee();

        System.out.println("\nFolder structure should match package names.");
    }
}
