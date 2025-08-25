import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (less than 100): ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a valid number.");
        } else {
            int counter = number - 1;
            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
        scanner.close();
    }
}
