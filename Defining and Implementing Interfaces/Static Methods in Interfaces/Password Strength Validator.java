interface SecurityUtils {
    static boolean isStrongPassword(String pwd) {
        return pwd.length() >= 8 && pwd.matches(".*[A-Z].*") && pwd.matches(".*[0-9].*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        String pass = "Hello123";
        System.out.println(SecurityUtils.isStrongPassword(pass) ? "Strong Password" : "Weak Password");
    }
}
