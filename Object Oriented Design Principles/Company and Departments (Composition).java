import java.util.ArrayList;

class Company {
    private String companyName;
    private ArrayList<Department> departments;
    
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    } 
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }    
    public void addEmployeeToDepartment(String deptName, String empName, int empId) {
        for (Department dept : departments) {
            if (dept.getDeptName().equals(deptName)) {
                dept.addEmployee(empName, empId);
                return;
            }
        }
    }    
    public void displayCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }    
    class Department {
        private String deptName;
        private ArrayList<Employee> employees;
        
        public Department(String deptName) {
            this.deptName = deptName;
            this.employees = new ArrayList<>();
        }       
        public void addEmployee(String empName, int empId) {
            employees.add(new Employee(empName, empId));
        }     
        public String getDeptName() {
            return deptName;
        }     
        public void displayEmployees() {
            System.out.println("  Department: " + deptName);
            for (Employee emp : employees) {
                System.out.println("    - " + emp);
            }
        }  
        class Employee {
            private String empName;
            private int empId;
            
            public Employee(String empName, int empId) {
                this.empName = empName;
                this.empId = empId;
            }       
            @Override
            public String toString() {
                return "ID: " + empId + ", Name: " + empName;
            }
        }
    }
}
public class CompositionExample {
    public static void main(String[] args) {
        Company company = new Company("Tech Corp");
        
        company.addDepartment("IT");
        company.addDepartment("HR");
        company.addDepartment("Finance");
        
        company.addEmployeeToDepartment("IT", "John Doe", 101);
        company.addEmployeeToDepartment("IT", "Jane Smith", 102);
        company.addEmployeeToDepartment("HR", "Bob Johnson", 201);
        company.addEmployeeToDepartment("Finance", "Alice Brown", 301);
        
        company.displayCompanyStructure();
    }
}
