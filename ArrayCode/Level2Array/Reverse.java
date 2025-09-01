import java.util.*;
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNum = number;
        int count = 0;
        while (tempNum != 0) {
            count++;
            tempNum /= 10;
        }
        int[] digits = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - i - 1];
        }
        System.out.print("Reversed Number = ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
    }
}
