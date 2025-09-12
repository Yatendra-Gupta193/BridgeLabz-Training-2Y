public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(rev);
    }
    void display() {
        if (isPalindrome())
            System.out.println(text + " is a palindrome");
        else
            System.out.println(text + " is not a palindrome");
    }
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.display();
    }
}
