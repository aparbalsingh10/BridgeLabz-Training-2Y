import java.util.*;
public class SubstringToChar {
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String text = sc.next();
        char[] userArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();
        boolean result = compareArrays(userArray, builtInArray);
        System.out.println("Custom char array " + new String(userArray));
        System.out.println("Built-in char array " + new String(builtInArray));
        System.out.println("Comparison Result " + result);
    }
}
