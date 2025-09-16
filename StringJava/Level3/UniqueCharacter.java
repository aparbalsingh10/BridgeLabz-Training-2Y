import java.util.*;

public class UniqueCharacter {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
           
        }
        return count;
    }
    public static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = c;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueChars(text);

        System.out.print("Unique Characters ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
