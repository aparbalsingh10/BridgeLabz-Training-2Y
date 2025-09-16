import java.util.*;
class NumberChecker {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }
    public static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}
 public class NumberChecker {
    public static void main(String[] args) {
        int number = 1201; 
        int[] digits = NumberChecker.getDigits(number);
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + NumberChecker.countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(NumberChecker.reverseArray(digits)));
        System.out.println("Is Palindrome? " + NumberChecker.isPalindrome(number));
        System.out.println("Is Duck Number? " + NumberChecker.isDuckNumber(number));
    }
}
