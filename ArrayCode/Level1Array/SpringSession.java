 import java.util.*;
 public class SpringSession {
    public static boolean isSpringSession(int month, int day) {
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        if (isSpringSeason(month, day))
            System.out.println("It is Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
