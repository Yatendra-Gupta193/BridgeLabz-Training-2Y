public class NullPointerDemo {
    static void generateException() {
        String text = null;
        System.out.println(text.length()); 
    }
    public static void main(String[] args) {
        generateException();
    }
}
