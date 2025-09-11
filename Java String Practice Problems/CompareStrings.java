import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int len = Math.min(s1.length(), s2.length());
        int i = 0;
        while (i < len && s1.charAt(i) == s2.charAt(i)) i++;
        if (i == len) {
            if (s1.length() == s2.length()) System.out.println("Both strings are equal");
            else if (s1.length() < s2.length()) System.out.println(s1 + " comes before " + s2);
            else System.out.println(s2 + " comes before " + s1);
        } else {
            if (s1.charAt(i) < s2.charAt(i)) System.out.println(s1 + " comes before " + s2);
            else System.out.println(s2 + " comes before " + s1);
        }
    }
}
