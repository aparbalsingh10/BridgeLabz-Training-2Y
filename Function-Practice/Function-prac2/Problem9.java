import java.util.*;
public class Problem9 {
    public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }
    public static double div(double a, double b) { return a / b; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.print("Enter operation (+ - * /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+': result = add(a, b); break;
            case '-': result = sub(a, b); break;
            case '*': result = mul(a, b); break;
            case '/': result = div(a, b); break;
            default:
                System.out.println("Invalid operation!");
                sc.close();
                return;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}
