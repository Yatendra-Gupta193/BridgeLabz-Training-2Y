public class NumberChecker4 {
    
    public static void main(String[] args) {
        int num = 121;
        int[] digits = storeDigits(num);
        int[] reversed = reverseDigits(digits);
        
        System.out.println("Number: " + num);
        System.out.println("Digit count: " + countDigits(num));
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Reversed: " + java.util.Arrays.toString(reversed));
        System.out.println("Arrays equal: " + arraysEqual(digits, reversed));
        System.out.println("Is palindrome: " + isPalindrome(digits));
        System.out.println("Is duck: " + isDuck(digits));
    }
    
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
    
    public static int[] storeDigits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }
    
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverseDigits(digits));
    }
    
    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 0) return true;
        }
        return false;
    }
}
