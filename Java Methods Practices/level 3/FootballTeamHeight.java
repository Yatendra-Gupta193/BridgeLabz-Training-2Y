import java.util.Random;

public class FootballTeamHeight {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // 150 to 250 inclusive
        }
        System.out.println("Player Heights (in cms):");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        System.out.println("\n--- Results ---");
        System.out.println("Sum of all heights: " + sum + " cm");
        System.out.println("Mean height: " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
    public static int findSum(int[] array) {
        int sum = 0;
        for (int height : array) {
            sum += height;
        }
        return sum;
    }
    public static double findMean(int[] array) {
        int sum = findSum(array);
        return (double) sum / array.length;
    }
    public static int findShortest(int[] array) {
        int shortest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < shortest) {
                shortest = array[i];
            }
        }
        return shortest;
    }
    public static int findTallest(int[] array) {
        int tallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > tallest) {
                tallest = array[i];
            }
        }
        return tallest;
    }
}
