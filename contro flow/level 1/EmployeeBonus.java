import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount = ₹" + bonus);
        } else {
            System.out.println("No bonus. Service must be more than 5 years.");
        }
        scanner.close();
    }
}
