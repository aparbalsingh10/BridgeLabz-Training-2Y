import java.util.*;
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}
public class LoginSystem {
    private static final String VALID_USER = "admin";
    private static final String VALID_PASS = "1234";
    public static void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(VALID_USER) || !pass.equals(VALID_PASS)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        try {
            validate(user, pass);
            System.out.println("✅ Login Successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println(" Login Failed: " + e.getMessage());
            System.out.println("Please try again.");
        }
    }
}
