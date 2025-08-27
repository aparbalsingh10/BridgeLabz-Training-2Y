import java.util.*;

class HarshadNumbar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;   
            sum += digit;             
            number /= 10; 
        }
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + "  Harshad Number");
        } else {
            System.out.println(originalNumber + "  Not a Harshad Number");
        }
    }
}
