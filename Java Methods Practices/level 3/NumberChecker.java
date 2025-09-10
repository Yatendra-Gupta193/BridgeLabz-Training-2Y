import java.util.Arrays;

public class NumberChecker {
    public static void main(String[] args) {
        int number = 153; 
        
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        
        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        
        System.out.println("Is duck number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong number: " + isArmstrongNumber(digits));
        
        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second largest digit: " + largestTwo[1]);
        
        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second smallest digit: " + smallestTwo[1]);
        System.out.println("\n--- Testing with number 102 ---");
        number = 102;
        System.out.println("Number: " + number);
        digits = storeDigits(number);
        System.out.println("Is duck number: " + isDuckNumber(digits));
    }
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int temp = Math.abs(number);      
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        int temp = Math.abs(number);
        
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }    
        int sum = 0;
        int power = digits.length;   
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }   
        return sum == number;
    }
    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            secondLargest = largest;
        }     
        return new int[]{largest, secondLargest};
    }
    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            secondSmallest = smallest;
        }      
        return new int[]{smallest, secondSmallest};
    }
}
