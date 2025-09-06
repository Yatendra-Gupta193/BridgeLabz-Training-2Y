import java.util.*;

public class UniqueCharFrequency {
    static char[] uniqueCharacters(String s) {
        int len = s.length();
        char[] temp = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (temp[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) temp[index++] = c;
        }
        char[] unique = new char[index];
        for (int i = 0; i < index; i++) unique[i] = temp[i];
        return unique;
    }
    static String[][] getFrequency(String s) {
        int[] freq = new int[256];
        int len = s.length();
        for (int i = 0; i < len; i++) freq[s.charAt(i)]++;
        char[] unique = uniqueCharacters(s);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
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
