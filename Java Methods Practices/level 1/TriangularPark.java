import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000;
        return distance / perimeter;
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter side 1 of triangle (meters): ");
        double side1 = scanner.nextDouble();  
        System.out.print("Enter side 2 of triangle (meters): ");
        double side2 = scanner.nextDouble();  
        System.out.print("Enter side 3 of triangle (meters): ");
        double side3 = scanner.nextDouble();
        
        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("The athlete needs to complete %.2f rounds\n", rounds);
        
        scanner.close();
    }
}
