import java.util.*;
class SumZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total = 0.0;
        double num= sc.nextDouble();
        while (num != 0) {
            total += num;
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble();
        }

        System.out.println("Total sum = " + total);
    }
}