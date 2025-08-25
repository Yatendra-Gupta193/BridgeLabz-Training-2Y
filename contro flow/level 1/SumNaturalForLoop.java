import java.util.Scanner;

public class SumNaturalForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
            if (formulaSum == loopSum) {
                System.out.println("Both sums are equal. Computation is correct.");
            } else {
                System.out.println("Mismatch in results.");
            }
        }
        scanner.close();
    }
}
