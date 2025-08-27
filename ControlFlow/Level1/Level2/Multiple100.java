import java.util.Scanner;
public class Multiple100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100 ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a number between 1 and 99");
        } else {
            System.out.println("Multiples of " + number + " below 100 are");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
