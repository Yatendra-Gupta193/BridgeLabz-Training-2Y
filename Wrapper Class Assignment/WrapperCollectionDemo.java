import java.util.ArrayList;

public class WrapperCollectionDemo {
    public static void main(String[] args) {

        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();
        for (double p : prices) {
            list.add(p);
        }
        double highest = list.get(0);
        double sum = 0;

        for (double p : list) {
            if (p > highest) highest = p;
            sum += p;
        }
        double avg = sum / list.size();

        System.out.println("Highest price = " + highest);
        System.out.println("Average price = " + avg);
    }
}
