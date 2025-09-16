import java.util.*;
public class ReplaceCharactor {
    public static String replace(String str, char oldChar, char newChar) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar)
                result += newChar;
            else
                result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String str = sc.nextLine();
        System.out.print("Enter character to replace ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter new character ");
        char newChar = sc.next().charAt(0);

        String modified = replace(str, oldChar, newChar);
        System.out.println("Modified String " + modified);
    }
}
