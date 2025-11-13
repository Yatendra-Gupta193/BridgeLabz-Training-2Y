public class BankLimitChecker {

    public static double remainingLimit(Double limit, double used) {

        if (limit == null)
            return 0.0;

        return limit - used;
    }
    public static void main(String[] args) {
        System.out.println(remainingLimit(5000.0, 1200)); // 3800
        System.out.println(remainingLimit(null, 500));     // 0.0
    }
}
