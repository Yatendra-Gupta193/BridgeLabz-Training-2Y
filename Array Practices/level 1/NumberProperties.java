import java.util.Scanner;

public class NumberProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is negative.");
            } else if (numbers[i] > 0) {
                System.out.println("Number " + numbers[i] + " is positive.");
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + numbers[i] + " is even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
        sc.close();
    }
}
