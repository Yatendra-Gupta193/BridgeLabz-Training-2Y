import java.util.*;

public class CharFrequencyNested {
    static String[] findFrequency(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];
        Arrays.fill(freq, 1);

        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        String[] result = new String[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }
        return Arrays.copyOf(result, index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] output = findFrequency(input);
        for (String line : output) System.out.println(line);
    }
}
