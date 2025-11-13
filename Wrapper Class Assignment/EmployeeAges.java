import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {

        int[] ages = {25, 32, 41, 19, 55};
        ArrayList<Integer> list = new ArrayList<>();

        for (int a : ages) list.add(a);

        System.out.println("Youngest = " + Collections.min(list));
        System.out.println("Oldest = " + Collections.max(list));
    }
}
