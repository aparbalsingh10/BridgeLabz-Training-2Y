import java.util.*;
class Reminder{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double  number1=sc.nextDouble();
        double  number2=sc.nextDouble();
        double  reminder=number1/number2;
        double  reminder2=number1%number2;
        System.out.println(reminder);
        System.out.println(reminder2);
    
    }
}