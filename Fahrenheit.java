import java.util.*;
class Fahrenheit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Fahrenheit");
        int Celsius=sc.nextInt();
        int Fahrenheit=(Celsius*9/5)+32;
        System.out.println(Fahrenheit);
    }
}