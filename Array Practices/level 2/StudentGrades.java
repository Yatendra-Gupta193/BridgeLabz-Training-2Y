import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            int p, c, m;

            do {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                p = scanner.nextInt();
            } while (p < 0 || p > 100);

            do {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                c = scanner.nextInt();
            } while (c < 0 || c > 100);

            do {
                System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
                m = scanner.nextInt();
            } while (m < 0 || m > 100);

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            int total = p + c + m;
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }
        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                " => Physics: " + physics[i] +
                ", Chemistry: " + chemistry[i] +
                ", Maths: " + maths[i] +
                ", Percentage: " + String.format("%.2f", percentage[i]) +
                "%, Grade: " + grade[i]);
        }
    }
}
