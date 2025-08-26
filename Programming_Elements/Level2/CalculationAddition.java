import java.util.*;
class CalculationAddition{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2; 
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}
