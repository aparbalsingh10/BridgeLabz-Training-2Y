import java.util.*;
class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an Even number");
            } else {
                System.out.println(i + " is an Odd number");
            }
        }
    }
}
