import java.util.*;
public class TrimSpace {
    public static int[] findTrimIndexes(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }  
    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces");
        String input = sc.nextLine();
        int[] indexes = findTrimIndexes(input);
        String trimmedCustom = customSubstring(input, indexes[0], indexes[1]);
        String trimmedBuiltIn = input.trim();
        System.out.println("Custom Trimmed \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both equal " + compareStrings(trimmedCustom, trimmedBuiltIn));
    }
}
