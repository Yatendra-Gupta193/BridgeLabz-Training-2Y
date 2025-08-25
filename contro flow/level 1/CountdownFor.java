import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter countdown start value: ");
        int start = scanner.nextInt();

        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched!");
        scanner.close();
    }
}
