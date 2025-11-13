public class WrapperComparison {
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b : " + (a == b));
        System.out.println("c == d : " + (c == d));
        System.out.println("a.equals(b) : " + a.equals(b));

        System.out.println("\nWhy results are different?");
        System.out.println("- a and b are between -128 to 127, so they are cached.");
        System.out.println("- c and d are outside that range, so different objects.");
    }
}
