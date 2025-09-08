import java.util.Scanner;
public class SumNaturalRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number (positive integer)");
            return;
        }  
        int recursiveSum = calculateSumRecursive(n);
        int formulaSum = n * (n + 1) / 2;
        
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Results match: " + (recursiveSum == formulaSum));
        
        scanner.close();
    }    
    public static int calculateSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calculateSumRecursive(n - 1);
    }
}
