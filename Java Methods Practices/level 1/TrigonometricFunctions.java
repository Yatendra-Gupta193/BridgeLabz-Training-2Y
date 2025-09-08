import java.util.Scanner;
public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        System.out.printf("Sine: %.4f\n", sine);
        System.out.printf("Cosine: %.4f\n", cosine);
        System.out.printf("Tangent: %.4f\n", tangent);
        
        sc.close();
    }
}
