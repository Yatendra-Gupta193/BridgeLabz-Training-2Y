import java.util.ArrayList;
public class AutoboxingDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // auto-boxing
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(8);
        list.add(12);

        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
