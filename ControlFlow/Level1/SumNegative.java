import java.util.*;
class SumNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number or negative ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            total += num;
        }

        System.out.println( total);
    }
}
