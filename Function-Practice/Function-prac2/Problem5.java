import java.util.*;
public class Problem5 {
    public static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--)
            rev += str.charAt(i);

        return rev.equalsIgnoreCase(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
