import java.util.*;

public class CharFrequency {
    static String[][] getFrequency(String s) {
        int[] freq = new int[256];
        int len = s.length();
        for (int i = 0; i < len; i++) freq[s.charAt(i)]++;
        int count = 0;
        for (int i = 0; i < 256; i++) if (freq[i] > 0) count++;
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[][] freq = getFrequency(input);
        for (String[] row : freq) System.out.println(row[0] + " : " + row[1]);
    }
}
