import java.util.*;

class NumberCheck {
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
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }
    public static boolean isHarshad(int number) {
        int sum = sumOfDigits(getDigits(number));
        return number % sum == 0;
    }
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigits(number);
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}
 class Main {
    public static void main(String[] args) {
        int number = 216;
        int[] digits = NumberChecker.getDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + NumberChecker.sumOfDigits(digits));
        System.out.println("Sum of squares: " + NumberChecker.sumOfSquares(digits));
        System.out.println("Is Harshad? " + NumberChecker.isHarshad(number));

        System.out.println("Digit Frequencies:");
        int[][] freq = NumberChecker.digitFrequency(number);
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " => " + freq[i][1] + " times");
            }
        }
    }
}
