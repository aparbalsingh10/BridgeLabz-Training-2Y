import java.util.*;
class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  ");
        int number = sc.nextInt();
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number ");
            return;
        }
        int[] multiplicationResult = new int[10]; 
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }
        for (int i = 1; i<= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }
    }
}
