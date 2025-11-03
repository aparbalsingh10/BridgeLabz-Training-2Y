interface SecurityUtil {
    static boolean isStrongPassword(String pwd) {
        return pwd.length() >= 8 && pwd.matches(".*[A-Z].*") && pwd.matches(".*\\d.*");
    }
}
public class PasswordTest {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("Test@123"));
    }
}
