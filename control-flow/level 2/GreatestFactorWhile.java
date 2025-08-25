import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int counter = number - 1;
        int greatestFactor = 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor: " + greatestFactor);

        scanner.close();
    }
}
