import static java.lang.Math.*;   
public class StaticImportDemo {
    public static void main(String[] args) {

        double a = 25;
        double b = -12.5;

        System.out.println("sqrt(25) = " + sqrt(a));
        System.out.println("pow(2,3) = " + pow(2, 3));
        System.out.println("max(10,20) = " + max(10, 20));
        System.out.println("min(5, 9) = " + min(5, 9));
        System.out.println("abs(-12.5) = " + abs(b));

        System.out.println("\nWhy static import?");
        System.out.println("- It helps shorten code and avoid Math. prefix.");
        System.out.println("When to avoid?");
        System.out.println("- Avoid when too many static methods cause confusion.");
    }
}
