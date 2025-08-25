import java.util.*;
class CentimeterInch{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        double height=sc.nextDouble();
        double totalinch=(height/2.54);
        int Foot= (int) (totalinch/12);
        double inch=totalinch%12;
        System.out.println(height);
        System.out.println(Foot);
        System.out.println(inch);
    }
}