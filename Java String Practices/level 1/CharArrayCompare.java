import java.util.Scanner;

public class CharArrayCompare {
    public static char[] myToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
      
        char[] arr1 = myToCharArray(text);
        char[] arr2 = text.toCharArray();

        boolean result = compareArrays(arr1, arr2);

        System.out.println("Custom char array: " + new String(arr1));
        System.out.println("Built-in char array: " + new String(arr2));
        System.out.println("Are both arrays same? " + result);

        sc.close();
    }
}
