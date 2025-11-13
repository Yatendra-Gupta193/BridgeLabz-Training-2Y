import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {
    public static void main(String[] args) {

        int[] ages = {25, 32, 41, 29, 19, 55};

        ArrayList<Integer> list = new ArrayList<>();

        // Convert int[] to ArrayList<Integer>
        for (int age : ages) {
            list.add(age);  // auto-boxing
        }
        int youngest = Collections.min(list);
        int oldest = Collections.max(list);

        System.out.println("Youngest employee age = " + youngest);
        System.out.println("Oldest employee age   = " + oldest);
    }
}
