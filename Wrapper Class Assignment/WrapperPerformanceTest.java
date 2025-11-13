import java.util.ArrayList;
public class WrapperPerformanceTest {
    public static void main(String[] args) {

        int size = 1_000_000;
        long start1 = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);  
        }
        long sum1 = 0;
        for (int n : list) {
            sum1 += n;  
        }
        long end1 = System.currentTimeMillis();
        long timeList = end1 - start1;
      
        long start2 = System.currentTimeMillis();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        long sum2 = 0;
        for (int n : arr) {
            sum2 += n;
        }
        long end2 = System.currentTimeMillis();
        long timeArray = end2 - start2;


        System.out.println("Sum using ArrayList<Integer> = " + sum1);
        System.out.println("Time (ArrayList) = " + timeList + " ms\n");

        System.out.println("Sum using int[] = " + sum2);
        System.out.println("Time (int[]) = " + timeArray + " ms");
    }
}
