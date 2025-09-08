import java.util.Scanner;
public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int smallest = num1;
        int largest = num1;
        
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        
        System.out.println(smallest);
        System.out.println(largest);  
        sc.close();
    }
}
