import java.util.Scanner;

public class StudentScoreCard {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);
    }
    
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 100);
            scores[i][1] = (int)(Math.random() * 100);
            scores[i][2] = (int)(Math.random() * 100);
        }
        return scores;
    }
    
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = average;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChem\tMaths\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            double percentage = results[i][2];
            char grade;
            
            if (percentage >= 80) grade = 'A';
            else if (percentage >= 70) grade = 'B';
            else if (percentage >= 60) grade = 'C';
            else if (percentage >= 50) grade = 'D';
            else if (percentage >= 40) grade = 'E';
            else grade = 'R';
            
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%c\n",
                i+1, scores[i][0], scores[i][1], scores[i][2], 
                results[i][0], results[i][1], results[i][2], grade);
        }
    }
}
