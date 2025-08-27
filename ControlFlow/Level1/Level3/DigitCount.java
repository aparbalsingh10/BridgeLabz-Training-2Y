import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int count = 0;
        int originalNumber = number;
        while (number != 0) {
            number /= 10;  
            count++; 
        }
        System.out.println("The number " + originalNumber );
        System.out.println( count + " digits");
    }
}
