public class FactorAnalyzer {
    
    public static void main(String[] args) {
        int num = 12;
        int[] factors = findFactors(num);
        
        System.out.println("Number: " + num);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Greatest factor: " + findGreatestFactor(factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Product of cubed factors: " + productCubedFactors(factors));
    }
    
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    public static double productCubedFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}
