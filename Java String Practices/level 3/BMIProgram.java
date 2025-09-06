import java.util.*;

public class BMIProgram {
    static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
    static String[] calculate(double weight, double height) {
        double h = height / 100.0;
        double bmi = weight / (h * h);
        String status = getStatus(bmi);
        return new String[]{String.valueOf(weight), String.valueOf(height), String.format("%.2f", bmi), status};
    }
    static String[][] process(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            result[i] = calculate(data[i][0], data[i][1]);
        }
        return result;
    }
    static void display(String[][] arr) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (String[] row : arr) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        String[][] result = process(data);
        display(result);
    }
}
