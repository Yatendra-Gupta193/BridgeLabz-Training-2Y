import java.util.Arrays;

public class NumberCheckerQ3 {  
    public static void main(String[] args) {
        int number = 21;
        int[] digits = storeDigits(number);
        
        System.out.println("Number: " + number);
        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Digit sum: " + sumDigits(digits));
        System.out.println("Square sum: " + sumSquares(digits));
        System.out.println("Is Harshad: " + isHarshad(number, digits));
        System.out.println("Digit frequencies: " + Arrays.deepToString(findFrequencies(digits)));
    } 
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }    
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }    
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }  
    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }   
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumDigits(digits);
        return number % sum == 0;
    }   
    public static int[][] findFrequencies(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }       
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }      
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }
}
