import java.util.Scanner;

public class ShortestLongestWord {
    static int myLength(String s) {
        int c = 0;
        try {
            for (;;) { s.charAt(c); c++; }
        } catch (Exception e) { return c; }
    }
    static String[] mySplit(String s) {
        int len = myLength(s), wc = 1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') wc++;
        String[] w = new String[wc];
        int idx = 0; String t = "";
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') { w[idx++] = t; t = ""; }
            else t += s.charAt(i);
        }
        w[idx] = t; return w;
    }
    static String[][] wordWithLength(String[] w) {
        String[][] a = new String[w.length][2];
        for (int i = 0; i < w.length; i++) {
            a[i][0] = w[i];
            a[i][1] = String.valueOf(myLength(w[i]));
        }
        return a;
    }
    static String[] shortestLongest(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]), max = min;
        String smin = arr[0][0], smax = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            int l = Integer.parseInt(arr[i][1]);
            if (l < min) { min = l; smin = arr[i][0]; }
            if (l > max) { max = l; smax = arr[i][0]; }
        }
        return new String[]{smin, smax};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = mySplit(text);
        String[][] arr = wordWithLength(words);
        String[] res = shortestLongest(arr);
        System.out.println("Shortest: " + res[0]);
        System.out.println("Longest: " + res[1]);
    }
}
