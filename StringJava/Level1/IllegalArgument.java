import java.util.*;
public class IllegalArgument {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught " + e);
        } catch (RuntimeException e) {
            System.out.println(" RuntimeException caught " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text ");
        String input = sc.next();
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Program stopped due to: " + e);
        }
        handleException(input);
    }
}
