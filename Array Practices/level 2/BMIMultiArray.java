import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double height, weight;
            do {
                System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
                height = scanner.nextDouble();
            } while (height <= 0);

            do {
                System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
            } while (weight <= 0);

            personData[i][0] = height;
            personData[i][1] = weight;
        }
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                ": Height = " + personData[i][0] +
                " m, Weight = " + personData[i][1] +
                " kg, BMI = " + String.format("%.2f", personData[i][2]) +
                ", Status = " + weightStatus[i]);
        }
    }
}
