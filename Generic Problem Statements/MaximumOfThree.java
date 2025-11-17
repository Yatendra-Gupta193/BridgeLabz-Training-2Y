class MaximumOfThree {
    static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximum(10, 20, 15));
        System.out.println(maximum(3.5, 2.2, 9.1));
        System.out.println(maximum("Apple", "Banana", "Cat"));
    }
}
