import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string ");
        String s1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");
        System.out.print("Enter second string ");
        String s2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("The strings are Anagrams");
        else
            System.out.println("The strings are NOT Anagrams");
    }
}
