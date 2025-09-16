class EmployeeRecords {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary());
    }
    public static void main(String[] args) {
        Manager mgr = new Manager(201, "IT", 60000);
        mgr.displayDetails();

        mgr.setSalary(75000);  
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
