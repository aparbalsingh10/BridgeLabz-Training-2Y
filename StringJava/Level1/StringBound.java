import java.util.*;
public class StringBound {
    public static void generateException(String text) {
        System.out.println("Character at index 100: " + text.charAt(100));
    }
    public static void handleException(String text) {
        try {
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught " + e);
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
