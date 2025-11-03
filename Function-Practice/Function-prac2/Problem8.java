import java.util.*;
public class Problem8 {
    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("In Celsius: " + fToC(f));
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("In Fahrenheit: " + cToF(c));

        sc.close();
    }
}
