import static java.lang.Math.*;  
InterestCalculator {
    public double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100;
    }
    public double calculateCompoundInterest(double P, double R, double T) {
        return P * pow((1 + R / 100), T) - P;
    }
}
public class BankInterestCalculatorDemo {
    public static void main(String[] args) {

        InterestCalculator ic = new InterestCalculator();

        double P = 10000, R = 5, T = 2;

        double si = ic.calculateSimpleInterest(P, R, T);
        double ci = ic.calculateCompoundInterest(P, R, T);

        System.out.println("=== Banking Interest Calculation ===");
        System.out.println("Simple Interest  : " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
