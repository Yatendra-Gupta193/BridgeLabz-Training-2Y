import java.util.*;
public class ProductRatings {
    public static void main(String[] args) {

        int[] oldRatings = {3, 5, 4};
        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(4);

        ArrayList<Integer> allRatings = new ArrayList<>();
        for (int r : oldRatings) {
            allRatings.add(r); // auto-boxing
        }
        for (Integer r : newRatings) {
            if (r != null)
                allRatings.add(r);
        }
        int sum = 0;
        for (int r : allRatings) sum += r;

        double avg = (double) sum / allRatings.size();

        System.out.println("Average Rating = " + avg);
    }
}
