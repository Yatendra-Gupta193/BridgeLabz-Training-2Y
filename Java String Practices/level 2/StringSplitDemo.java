import java.util.Scanner;

public class StringSplitDemo {
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
    static String[] mySplit(String str) {
        int len = myLength(str);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int index = 0;
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += str.charAt(i);
            }
        }
        words[index] = temp;
        return words;
    }
    static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] manual = mySplit(text);
        String[] builtin = text.split(" ");
        System.out.println("Manual split:");
        for (String w : manual) System.out.println(w);
        System.out.println("Built-in split:");
        for (String w : builtin) System.out.println(w);
        System.out.println("Same? " + compareArrays(manual, builtin));
    }
}
