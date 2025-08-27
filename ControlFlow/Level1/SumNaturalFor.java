import java.util.*;
class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0)");
        } else {
            int formulaResult = n * (n + 1) / 2;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum using formula " + formulaResult);
            System.out.println("Sum using for loop " + sum);
            if (sum == formulaResult) {
                System.out.println("Both results match");
            } else {
                System.out.println("Something is wrong");
            }
        }
    }
}
