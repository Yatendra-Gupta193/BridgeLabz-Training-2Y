import java.util.*;

public class FirstNonRepeating {
    static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        int len = s.length();
        for (int i = 0; i < len; i++) freq[s.charAt(i)]++;
        for (int i = 0; i < len; i++) if (freq[s.charAt(i)] == 1) return s.charAt(i);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char result = firstNonRepeating(input);
        if (result != 0) System.out.println(result);
        else System.out.println("No non-repeating character");
    }
}
