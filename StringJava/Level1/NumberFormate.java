import java.util.*;
public class NumberFormate{
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted Number " + number);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number " + number);
        } catch (NumberFormatException e) {
            System.out.println(" NumberFormatException caught " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String input = sc.next();
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Program stopped due to " + e);
        }
        handleException(input);
    }
}
