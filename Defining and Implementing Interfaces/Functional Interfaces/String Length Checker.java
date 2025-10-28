import java.util.function.Function;

public class StringLengthCheck {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = str -> str.length();
        String msg = "Hello Functional Interface!";
        int len = lengthFunc.apply(msg);
        System.out.println("Message length: " + len);
        if (len > 20)
            System.out.println("Message too long!");
    }
}
