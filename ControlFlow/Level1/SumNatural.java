import java.util.*;
class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0)");
        } else {
            int formulaResult = n * (n + 1) / 2;
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println( formulaResult);
            System.out.println( sum);
            if (sum == formulaResult) {
                System.out.println("Both results match");
            } else {
                System.out.println("Something is wrong");
            }
        }
    }
}