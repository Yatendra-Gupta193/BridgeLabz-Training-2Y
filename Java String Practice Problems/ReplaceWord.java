import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();
        String result = sentence.replace(oldWord, newWord);
        System.out.println(result);
    }
}
