import java.util.Scanner;

public class StringLengthDemo {
    static int myLength(String str) {
        int count = 0;
        try {
            for (;;) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("User-defined length: " + myLength(text));
        System.out.println("Built-in length: " + text.length());
    }
}
