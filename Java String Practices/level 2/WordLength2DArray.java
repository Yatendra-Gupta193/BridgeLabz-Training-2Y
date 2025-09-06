import java.util.Scanner;

public class WordLength2DArray {
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
    static String[][] wordWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(myLength(words[i]));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = mySplit(text);
        String[][] result = wordWithLength(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");
        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]);  
            System.out.println(result[i][0] + "\t\t" + len);
        }
    }
}
