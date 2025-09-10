public class NumberChecker5 {
    
    public static void main(String[] args) {
        int num = 7;
        int[] digits = storeDigits(num);
        
        System.out.println("Number: " + num);
        System.out.println("Is prime: " + isPrime(num));
        System.out.println("Is neon: " + isNeon(num));
        System.out.println("Is spy: " + isSpy(digits));
        System.out.println("Is automorphic: " + isAutomorphic(num));
        System.out.println("Is buzz: " + isBuzz(num));
    }
    
    public static int[] storeDigits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }
    
    public static boolean isSpy(int[] digits) {
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }
    
    public static boolean isAutomorphic(int n) {
        long square = (long) n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }
    
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
