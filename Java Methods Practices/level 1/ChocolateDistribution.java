import java.util.Scanner;
public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        
        int eachGets = chocolates / children;
        int remaining = chocolates % children;
        
        System.out.println("Each child gets: " + eachGets);
        System.out.println("Remaining chocolates: " + remaining);
        
        sc.close();
    }
}
