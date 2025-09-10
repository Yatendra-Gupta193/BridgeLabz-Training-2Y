public class EmployeeBonus {
    
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] newData = calculateBonus(employeeData);
        displayResults(employeeData, newData);
    }
    
    public static int[][] generateEmployeeData() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 900000) + 100000;
            data[i][1] = (int)(Math.random() * 15) + 1;
        }
        return data;
    }
    
    public static double[][] calculateBonus(int[][] data) {
        double[][] newData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double oldSalary = data[i][0];
            int years = data[i][1];
            double bonusPercent = years > 5 ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercent;
            double newSalary = oldSalary + bonus;
            
            newData[i][0] = oldSalary;
            newData[i][1] = newSalary;
            newData[i][2] = bonus;
        }
        return newData;
    }
    
    public static void displayResults(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d\t%d\t%.0f\t%.0f\n", 
                i+1, oldData[i][0], oldData[i][1], newData[i][2], newData[i][1]);
            
            totalOld += newData[i][0];
            totalNew += newData[i][1];
            totalBonus += newData[i][2];
        }
        
        System.out.printf("\nTotal Old Salary: %.0f\n", totalOld);
        System.out.printf("Total New Salary: %.0f\n", totalNew);
        System.out.printf("Total Bonus: %.0f\n", totalBonus);
    }
}
