import java.util.*;
class Smallest{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        boolean smallest=(number1 < number2 && number1 < number3);
        System.out.println(smallest);
    }
}