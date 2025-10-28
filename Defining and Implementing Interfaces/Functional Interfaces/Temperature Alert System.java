import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = temp -> temp > 40.0;
        double temp = 42.5;
        if (isHighTemp.test(temp))
            System.out.println("⚠️ Alert: High Temperature!");
        else
            System.out.println("Temperature Normal.");
    }
}
