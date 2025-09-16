import java.util.*;

public class StringLength {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text ");
        String text = sc.next();

        int customLen = customLength(text);

        int builtInLen = text.length();

        System.out.println("Custom Length " + customLen);
        System.out.println("Built-in Length " + builtInLen);
    }
}
