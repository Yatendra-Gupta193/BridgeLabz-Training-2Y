import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    if (j == 0)
                        System.out.print("Enter Physics marks for " + (i + 1) + ": ");
                    else if (j == 1)
                        System.out.print("Enter Chemistry marks " + (i + 1) + ": ");
                    else
                        System.out.print("Enter Maths marks " + (i + 1) + ": ");
                    mark = scanner.nextInt();
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }
        }
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
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
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " => Physics: " + marks[i][0] +
                    ", Chemistry: " + marks[i][1] +
                    ", Maths: " + marks[i][2] +
                    ", Percentage: " + String.format("%.2f", percentage[i]) +
                    "%, Grade: " + grade[i]);
        }
    }
}
