public class NumberChecker6 {
    
    public static void main(String[] args) {
        int num = 28;
        
        System.out.println("Number: " + num);
        System.out.println("Is perfect: " + isPerfect(num));
        System.out.println("Is abundant: " + isAbundant(num));
        System.out.println("Is deficient: " + isDeficient(num));
        System.out.println("Is strong: " + isStrong(num));
    }
    
    public static int sumProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }
    
    public static boolean isPerfect(int n) {
        return sumProperDivisors(n) == n;
    }
    
    public static boolean isAbundant(int n) {
        return sumProperDivisors(n) > n;
    }
    
    public static boolean isDeficient(int n) {
        return sumProperDivisors(n) < n;
    }
    
    public static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }
    
    public static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
