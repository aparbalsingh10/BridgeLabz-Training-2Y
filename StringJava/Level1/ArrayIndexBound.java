import java.util.*;
public class ArrayIndexBound {
    public static void generateException(String[] names) {
        System.out.println("Accessing index 10: " + names[10]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught " + e);
        } catch (RuntimeException e) {
            System.out.println(" Runtime Exception caught " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Program stopped due to: " + e);
        }
        handleException(names);
    }
}
