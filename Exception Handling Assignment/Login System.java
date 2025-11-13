import java.util.Scanner;

// Custom Exception
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}
class Login {
    String validUser = "admin";
    String validPass = "1234";

    void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Login Failed: Invalid Username or Password!");
        }
        System.out.println("Login Successful!");
    }
}
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        try {
            login.validate(u, p);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
            System.out.println("Please try again.");
        }
    }
}
